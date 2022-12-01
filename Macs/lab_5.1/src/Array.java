public class Array {
    //
    //--- PRINT ARRAY
    //
    public void printArray(byte[] array, String separator) {
        for (byte item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(byte[] array) {
        for (byte item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(short[] array, String separator) {
        for (short item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(short[] array) {
        for (short item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(int[] array, String separator) {
        for (int item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(long[] array, String separator) {
        for (long item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(long[] array) {
        for (long item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(float[] array, String separator) {
        for (float item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(float[] array) {
        for (float item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(double[] array, String separator) {
        for (double item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(double[] array) {
        for (double item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(boolean[] array, String separator) {
        for (boolean item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(boolean[] array) {
        for (boolean item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(char[] array, String separator) {
        for (char item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(char[] array) {
        for (char item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    public void printArray(String[] array, String separator) {
        for (String item : array) {
            System.out.print(item);
            System.out.print(separator);
        }
        System.out.print('\n');
    }

    public void printArray(String[] array) {
        for (String item : array) {
            System.out.print(item);
            System.out.print(' ');
        }
        System.out.print('\n');
    }

    //
    //--- SUMM ARRAY
    //
    public long sumAll(byte[] array) {
        long summ = 0;
        for (var item : array) {
            summ += item;
        }
        return summ;
    }

    public long sumAll(short[] array) {
        long summ = 0;
        for (var item : array) {
            summ += item;
        }
        return summ;
    }

    public long sumAll(int[] array) {
        long summ = 0;
        for (var item : array) {
            summ += item;
        }
        return summ;
    }

    public long sumAll(long[] array) {
        long summ = 0;
        for (var item : array) {
            summ += item;
        }
        return summ;
    }

    public float sumAll(float[] array) {
        float summ = 0;
        for (var item : array) {
            summ += item;
        }
        return summ;
    }

    public double sumAll(double[] array) {
        double summ = 0;
        for (var item : array) {
            summ += item;
        }
        return summ;
    }

    public StringBuilder sumAll(char[] array) {
        StringBuilder summ = new StringBuilder();
        for (var item : array) {
            summ.append(item);
        }
        return summ;
    }

    public String sumAll(String[] array) {
        StringBuilder summ = new StringBuilder();
        for (var item : array) {
            summ.append(item);
        }
        return summ.toString();
    }

    //
    //--- FIND MAX
    //
    public byte findMax(byte[] array) {
        byte max = array[0];
        for (byte item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public short findMax(short[] array) {
        short max = array[0];
        for (short item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public long findMax(long[] array) {
        long max = array[0];
        for (long item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public float findMax(float[] array) {
        float max = array[0];
        for (float item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public double findMax(double[] array) {
        double max = array[0];
        for (double item : array) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public int findMax(char[] array) {
        int max = (array[0] - '0');
        for (char item : array) {
            if ((item - '0') > max) {
                max = (item - '0');
            }
        }
        return max;
    }

    public int findMax(String[] array) {
        int max_len = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > max_len) {
                max_len = array[i].length();
            }
        }
        return max_len;
    }

    //
    //--- SORT 1
    //
    public void sortArray(byte[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                byte temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(short[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                short temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                int temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(long[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                long temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(float[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                float temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(double[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                double temp = 0;
                if (array[j] < array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(char[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                char temp;
                if (array[j] - '0' < array[i] - '0') {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sortArray(String[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                String temp;
                if (array[j].length() < array[i].length()) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    //
    //--- SORT 2
    //
    public void odwroc(byte[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                byte temp = 0;
                if (array[j] > array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void odwroc(short[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                short temp = 0;
                if (array[j] > array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void odwroc(int[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                int temp = 0;
                if (array[j] > array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void sodwroc(long[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                long temp = 0;
                if (array[j] > array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void odwroc(float[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                float temp = 0;
                if (array[j] > array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void odwroc(double[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                double temp = 0;
                if (array[j] > array[i]) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void odwroc(char[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                char temp;
                if (array[j] - '0' > array[i] - '0') {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }

    public void odwroc(String[] array) {
        for (int i = 0; i < array.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < array.length; j++) {

                // Checking elements
                String temp;
                if (array[j].length() > array[i].length()) {

                    // Swapping
                    temp = array[i];
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            // Printing sorted array elements
            //System.out.print(array[i] + " ");
        }
    }
}