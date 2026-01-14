public class MaskingandMerging {
    public static void main(String[] args) {
        byte a=9,b=12;
        byte c;

        c= (byte) (a <<4);
        c= (byte) (c |b);
    }
}
// this is very confusing topic related to bits and similar topic is narrowing and widening -- Doing it in future if
// needed --20 nov 2025