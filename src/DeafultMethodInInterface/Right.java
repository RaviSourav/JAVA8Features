package DeafultMethodInInterface;

public interface Right {
    public default void m1()
    {
        System.out.println("From Right");
    }
}
