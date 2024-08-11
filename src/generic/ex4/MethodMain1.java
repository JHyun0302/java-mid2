package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        /**
         * 제네릭 메서드 타입 추론 : 자바 컴파일러는 i의 타입이 `Integer`라는 것을 추론 가능!
         * 하지만 실제로는 타입 인자가 전달된다는 것을 기억하자.
         */
        System.out.println("타입 추론");
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);


        String str = GenericMethod.<String>genericMethod("hello");
//        GenericMethod.<String>numberMethod("hello"); //컴파일 오류 : Number의 자식만 입력 가능
    }
}
