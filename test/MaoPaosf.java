public class MaoPaosf {
    public static void main(String[] args) {
        MaoPaosf maoP = new MaoPaosf();
        int[] arrs = new int[] {10,7,4,1,6,5,3,9,8,2};
        maoP.maop(arrs);
    }
/*
id:qianchun
mail:1668196878@qq.com
job:冒泡排序算法
 */
    public void maop(int[] arr) {
        for (int i = 0;i<arr.length;i++) {
            for (int y=1;y<arr.length-i;y++){
                if (arr[y-1] > arr[y]) {
                    int Temp = arr[y -1];
                    arr[y-1] = arr[y];
                    arr[y] = Temp;
                }
            }
        }
        amaop(arr);
    }

    public void amaop(int[] arr) {
        for (int i= 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
