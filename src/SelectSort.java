public class SelectSort {
    public static void main(String[] args) {
        SelectSort sel = new SelectSort();
        int[] arr = {1,2,5,7,9,10,8,3,4,6};
        sel.sort(arr);
    }

    public void sort(int[] array) {
        int index;
        for (int i=1;i<array.length;i++) {
            index = 0;
            for (int j=1;j <= array.length-i;j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            int temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index]=temp;
        }
        showArray(array);
    }

    public void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
