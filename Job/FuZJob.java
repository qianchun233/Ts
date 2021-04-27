import java.util.Arrays;

public class FuZJob {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3,7,9,5,2};
        int[] arr2 = Arrays.copyOfRange(arr1, 0,4);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+",");
        }
        System.out.println();
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+",");
        }
        
    }
}
