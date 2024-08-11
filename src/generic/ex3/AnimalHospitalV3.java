package generic.ex3;

import generic.animal.Animal;

/**
 * 타입 매개변수에 입력될 수 있는 상한을 지정해서 문제를 해결했다.
 * `AnimalHospitalV3<Integer>` 와 같이 동물과 전혀 관계없는 타입 인자를 컴파일 시점에 막는다.
 */
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
