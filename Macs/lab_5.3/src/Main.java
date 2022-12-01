public class Main {
    public static void main(String[] args) {
        var arr = new Array();

        System.out.println("BINARY SEARCH");

        byte[] b_arr = new byte[] {1,2,3,4,5,6,7};
        System.out.print("byte array: ");
        arr.printArray(b_arr);
        byte b_key = 4;
        System.out.printf("Index of number %d is %d\n\n\r", b_key, arr.binarySearch(b_arr, b_key));

        short[] s_arr = new short[] {1,2,3,4,5,6,7};
        System.out.print("short array: ");
        arr.printArray(s_arr);
        short s_key = 4;
        System.out.printf("Index of number %d is %d\n\n\r", s_key, arr.binarySearch(s_arr, s_key));

        int[] i_arr = new int[] {1,2,3,4,5,6,7};
        System.out.print("int array: ");
        arr.printArray(i_arr);
        int i_key = 4;
        System.out.printf("Index of number %d is %d\n\n\r", i_key, arr.binarySearch(i_arr, i_key));

        long[] l_arr = new long[] {1,2,3,4,5,6,7};
        System.out.print("long array: ");
        arr.printArray(l_arr);
        long l_key = 4;
        System.out.printf("Index of number %d is %d\n\n\r", i_key, arr.binarySearch(i_arr, i_key));

        float[] f_arr = new float[] {1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f};
        System.out.print("float array: ");
        arr.printArray(f_arr);
        float f_key = 3.0f;
        System.out.printf("Index of number %5.2f is %d\n\n\r", f_key, arr.binarySearch(f_arr, f_key));

        double[] d_arr = new double[] {1,2,3,4,5,6,7};
        System.out.print("double array: ");
        arr.printArray(d_arr);
        double d_key = 4;
        System.out.printf("Index of number %5.2f is %d\n\n\r", d_key, arr.binarySearch(d_arr, d_key));

        char[] c_arr = new char[] {'a','b','c','d','e','f','g'};
        System.out.print("char array: ");
        arr.printArray(c_arr);
        char c_key = 'f';
        System.out.printf("Index of char %c is %d\n\n\r", c_key, arr.binarySearch(c_arr, c_key));
    }
}