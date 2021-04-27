public class ZJxzpaixu {
    public static void main(String[] args) {
        ZJxzpaixu zj = new ZJxzpaixu();
        int[] arr = new int[] {86,90,10,5,1,100,75,4,32,55};
        zj.zjxz(arr);
    }

    public void zjxz(int[] array) {
        int index;
        for (int i=1;i<array.length;i++){
            index = 0;
            for (int y=1;y<=array.length-i;y++) {
                if (array[y] > array[index]) {
                    index = y;
                }
            }
            int Temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index] = Temp;
        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
