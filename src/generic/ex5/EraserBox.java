package generic.ex5;

/**
 * 타입 이레이저
 *
 */
public class EraserBox <T>{
    public boolean instanceCheck(Object param) {
//        return param instanceof T;
//        return param instanceof Object; //런타임 시
        return false;
    }

    public void create() {
//        return new T(); //컴파일 오류
//        return new Object(); //런타임 시
    }
}
