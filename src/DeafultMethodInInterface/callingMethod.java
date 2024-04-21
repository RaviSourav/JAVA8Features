package DeafultMethodInInterface;

public class callingMethod implements Left, Right{
    public void m1()
    {
        System.out.println("Test class");
        Right.super.m1();
        Left.super.m1();
    }

    @Override
    public void m2() {
        System.out.println("Abstract method");
    }

    public static void main(String args[])
    {
        callingMethod callingMethod = new callingMethod();
        callingMethod.m1();
        callingMethod.m2();
//        callingMethod.a = 20; // by deafult public static coming from interface
        System.out.println(callingMethod.a);
    }
}
