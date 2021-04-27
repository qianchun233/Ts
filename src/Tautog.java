public class Tautog {
    public static void main(String[] args) {
        int arr2[][] = {{4,3}, {1,2}};
        System.out.println("arr2 is :");
        int i = 0;
        for (int x[]:arr2){
            i++;
            int j = 0;
            for (int e:x){
                j++;
                if (i == arr2.length && j == x.length){
                    System.out.print(e);
                } else {
                    //如果不是二维数组中的最后一个元素
                    System.out.print(e + ",");
                }
            }
        }
    }
}
