package LambdaExpression;

// this annotation is not required if only declaring one abstract method
// but it is required to make it Functional interface explicitly so that no more than one abstract method can be declared.
@FunctionalInterface
interface Lambda{
    void sum(int a,int b);
}
class Implementor implements Lambda{
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }
}

public class BasicDemo1 {
    public static void main(String[] args) {

        //using class and method
        Lambda lambda = new Implementor();
        lambda.sum(5,3);

        //using Lambda Expression
        Lambda lambda1 = (a,b) -> System.out.println(a+b);
        lambda1.sum(1,2);
    }
}


