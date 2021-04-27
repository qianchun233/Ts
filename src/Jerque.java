public class Jerque {
    public static void main(String[] args) {
        String str = "";
        long starTime = System.currentTimeMillis(); //定义对字符串执行操作的起始时间
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long endTime = System.currentTimeMillis(); //定义对字符串操作后的时间；
        long time = endTime - starTime;
        System.out.println("String消耗的时间："+time);
        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000;i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("StringBuilder消耗时间为："+time);
    }
}
