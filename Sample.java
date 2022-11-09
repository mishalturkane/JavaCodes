package interfacdemo4;

public interface Sample {
    void m1();
    default void m2()
    {
        System.out.println("In m2 of sample");
    }
}
