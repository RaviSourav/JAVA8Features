package DeafultMethodInInterface;

public interface Left {

    int a = 10;
    public default void m1()
    {
        System.out.println("From Left");
    }
    public void m2();
}
