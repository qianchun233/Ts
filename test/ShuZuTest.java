public class ShuZuTest {
    public static void main(String[] args) {
        int[][] sz = new int[][]{
                {3,4,5},
                {6,2,1},
                {8,3,6}
        };
        for (int t=0;t< sz.length;t++){
            for (int i=0;i< sz.length;i++){
                System.out.println(sz[t][i]);
            }
        }
    }
}
