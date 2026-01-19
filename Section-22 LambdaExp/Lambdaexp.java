public class Lambdaexp {
    public static void main(String[] args) {
        MyLambda m=(s)->{System.out.println(s);};

        m.display("Java Language");
    }
}


@FunctionalInterface
interface MyLambda{
    public void display(String str);
}
