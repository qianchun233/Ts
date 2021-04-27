public class SZ {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5,7,9,8,2,6,10};
        int arr1 = 0;
        for (int i=0;i<arr.length;i++){
            arr1 += arr[i];
        }
        System.out.println("arr数组元素之和为："+arr1);

        int max = arr[0];
        for (int i = 1;i<arr.length;i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is "+max);

        Xinbianli arx = new Xinbianli(arr);
        arx.getXbl();
    }

    static class Xinbianli{
        private int[] xinbianli;

        public Xinbianli(int[] xinbianli){
            this.xinbianli = xinbianli;
        }

        public void getXbl(){
            for (int xbl : xinbianli){
                System.out.println(xbl);
            }
        }
    }
}
