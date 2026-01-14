public class formatted_output{
    public static void main(String[] args) {

        System.out.printf("hello\n");

        int a=10;
        float b=12.33f;
        char c='a';

        System.out.printf("hello %d %f %c world\n",a,b,c);

        /* if we have changed %d with o(octal) or x(hexadecimal) it will display different value
        * like for %o the output becomes 12
        * for %x the output becomes a */

    }
}