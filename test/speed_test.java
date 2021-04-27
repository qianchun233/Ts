import java.util.Random;

public class speed_test {
    public static void main(String[] args) {
        int length = 1000000;
        long[] rand_array = new long[length];
        double[] output = new double[length];
        Random rand = new Random();

        for (int i=0;i<length;i++){
            rand_array[i] = rand.nextLong();
        }

        long start = System.currentTimeMillis();

        for (int i=0;i<length;i++){
            output[i] = 1.0/rand_array[i];
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
