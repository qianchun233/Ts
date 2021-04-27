import java.util.*;
import java.math.*;


public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你需要抽多少个数？ ");
        int k = in.nextInt();

        System.out.print("你能抽中的多少个数？ ");
        int n = in.nextInt();

        BigInteger lottery0dds = BigInteger.valueOf(1);

        for (int i= 1;i< k;i++){
            lottery0dds = lottery0dds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }
        System.out.println(lottery0dds);
    }
}
