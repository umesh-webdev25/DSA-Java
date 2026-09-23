public class typeCasting {
    public static void main(String[] arg){
        int i=100;
        long l=i;            // widening: automatic, no data loss
        double d = 10.8;
        int x = (int) d;    // narrowing: explicit cast require
        System.out.println("widening => "+l);
        System.out.println("narrowing => "+x);

    }
}
