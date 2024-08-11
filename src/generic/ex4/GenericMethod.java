package generic.ex4;

/**
 * 제네릭 메서드
 * **인스턴스 메서드, static 메서드**
 * 제네릭 메서드는 인스턴스 메서드와 static 메서드에 모두 적용할 수 있다.
 * **참고**
 * 제네릭 타입은 static 메서드에 타입 매개변수를 사용할 수 없다. 제네릭 타입은 객체를 생성하는 시점에 타입이 정해진다.
 * 그런데 static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관하다.
 * 따라서 static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야 한다.
 *
 */
public class GenericMethod {
    public static Object objMethod(Object obj) {
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic print : " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print : " + t);
        return t;
    }

}
