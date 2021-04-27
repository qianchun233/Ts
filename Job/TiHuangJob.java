import java.util.Arrays;

public class TiHuangJob {
    public static void main(String[] args) {
        String[] str = {"1","BB","10"};
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+",");
        }
        System.out.println();
        Arrays.fill(str,2,3,"bb");
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+",");
        }
    }
}
