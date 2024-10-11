
public class PrimitiveDatatypes {

    public static void main(String[] args) {

        byte b = 67;
        System.out.println(b);
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);
        System.out.println("Byte Bytes: " + Byte.BYTES + "\n");

        short s = 8676;
        System.out.println(s);
        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Bytes: " + Short.BYTES + "\n");

        int i = 100;
        System.out.println(i);
        System.out.println("Integer Min: " + Integer.MIN_VALUE);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);
        System.out.println("Integer Bytes: " + Integer.BYTES + "\n");

        float f = 78.987f;
        System.out.println(f);
        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Bytes: " + Float.BYTES + "\n");

        long l = 1004390857634967988L;
        System.out.println(l);
        System.out.println("Long Min: " + Long.MIN_VALUE);
        System.out.println("Long Max: " + Long.MAX_VALUE);
        System.out.println("Long Bytes: " + Long.BYTES + "\n");

        double d = 798076.986576;
        System.out.println(d);
        System.out.println("Double Min: " + Double.MIN_VALUE);
        System.out.println("Double Max: " + Double.MAX_VALUE);
        System.out.println("Double Bytes: " + Double.BYTES + "\n");

        boolean t = true;
        System.out.println(t);
        System.out.println("Boolean Bytes: 1\n");

        char c = 'A';
        System.out.println(c);
        System.out.println("Character Bytes: " + Character.BYTES + "\n");

        String str = "This is a string\n";
        System.out.println(str);
    }
}
