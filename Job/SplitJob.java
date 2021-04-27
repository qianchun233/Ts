public class SplitJob {
    public static void main(String[] args) {
        String str1 = "Hello Word";

        String str2 = "hello word";
        String[] st = str1.split("\n");
        String[] st2 = str2.split("\n");
        if (st.equals(st2)) {
            System.out.println("字符串匹配");
        } else {
            System.out.println("字符串不匹配");
        }
    }
}
