public class QsOs {
    public static void main(String[] args) {
        //TODO:判断变量x是奇数还是偶数
        i :for (int x = 1; x <=10; x++) {
            if (x % 2 == 0) {
                System.out.println(x+"是偶数");
                continue i;
            }
            System.out.println(x+"是奇数");
        }
        System.out.println("---END---");
    }
}
