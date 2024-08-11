package generic.ex5;

import generic.animal.Animal;

/**
 * 제네릭 메서드 vs 와일드카드
 * 제네릭 타입이나 제네릭 메서드를 정의하는게 꼭 필요한 상황이 아니라면, 더 단순한 와일드카드 사용을 권장
 */
public class WildcardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    //Box<Dog>, Box<Cat>, Box<Object>
    static void printWildcardV1(Box<?> box) {
        Object object = box.get(); //와일드카드인 `?`는 모든 타입을 다 받을 수 있다.
        System.out.println("? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    //제네릭 타입 or 제네릭 메서드 장점 : 전달한 타입을 명확하게 반환
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    //와일드 카드 한계 : 전달한 타입을 명확하게 반환 불가
    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
