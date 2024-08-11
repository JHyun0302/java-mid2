package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    /**
     * Z를 T로 바꾸더라도 제네릭 메서드가 적용된다.
     */
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className : " + animal.getClass().getName());
        System.out.println("t className : " + z.getClass().getName());
        return z;
    }
}
