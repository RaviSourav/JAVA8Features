package StaticInInterface;

public class CallingMethod implements StaticMethod {

    public static void print()
    {
        System.out.println("From implementation class");
    }
    public static void main(String[] args)
    {
        CallingMethod callingMethod = new CallingMethod();
//        callingMethod.print();
//        CallingMethod.print();
        StaticMethod.print();
        callingMethod.print();
    }
}
