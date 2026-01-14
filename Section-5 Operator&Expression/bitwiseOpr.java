public class bitwiseOpr {
    public static void main(String[] args) {
        int x=10;//we can also initialise integer in binary form like for 10 0b1010
        int y=6;//also for 6 is 0b0110,it will give the same answer
        int z,a,b;

        z=x&y;
        a=x|y;
        b=x^y;

        System.out.println(Integer.toBinaryString(a));//this is used to convert the integer output into binary
        System.out.println(z);
        System.out.println(b);
        int c=0b0010;
        int d=0b0011;
        int e;
        e=c|d;
        System.out.println(e);//this will give the output in integer values only

        int f=0b1000;
        int g=f<<1;//left shift means adding up
        int h=f>>1;//it means division
        System.out.println(g);
        System.out.println(h);
    }
}
