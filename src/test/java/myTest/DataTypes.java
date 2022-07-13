package myTest;

public class DataTypes {

    public static void primitiveDataTypes() {

        byte a =  12 + 12;
        System.out.println("Type of byte from -128 to 127. Example byte " + a);

        short b = -32 + 32768;
        System.out.println("Type of short from -32 768 to 32 767. Example short " + b);

        int c = 1234569 + 1234569000;
        System.out.println("Type of int from -2 147 483 648 to 2 147 483 647. Example int " + c);

        long d = -922337204 + 922337203;
        System.out.println("Type of long from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807. Example long " + d);

        double v =  c + d;
        System.out.println("int plus long = result double. Example double " + v);

        float e = 12.8F + 28888.0F;
        System.out.println("Type of float from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807. Example float " + e);

        double f = 567.6666 + 46.88888;
        System.out.println("Type of double from -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807. Example double " + f);

        boolean yes = 2 < 3;
        boolean no = 2 > 3;
        System.out.println("Type of boolean, true or false. Example 2 < 3 " + yes);
        System.out.println("Type of boolean, true or false. Example 2 > 3 " + no);

        char example = 'T';
        System.out.println(example);

    }

    public static void main(String[] args) {
        primitiveDataTypes();
    }
}
