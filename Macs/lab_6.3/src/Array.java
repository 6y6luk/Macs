public class Array {
    private double[] arr;
    public int size;

    public Array(int size)
    {
        arr = new double[size];
        this.size = size;
    }

     public Array(double[] arr)
     {
         this.arr = arr;
         size = this.arr.length;
     }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    double findMax() {
        double max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    double sumAll() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        return sum;
    }
}