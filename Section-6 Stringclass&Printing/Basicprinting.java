public class Basicprinting {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println(x+y+"sum");// there is big diff between both the statement here the plus(+) sign works
                                    // as an addition operator gives the output as --> 30sum

        System.out.println("sum"+x+y);// here the string came first so plus sign works as a concatenation and gives the
        //output as --> sum1020

        System.out.println("sum"+(x+y));// this will provide the output as --> sum30
    }
}
