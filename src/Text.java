public class Text {
    public static void main(String[] args) {
        String str = "We are students";
        int size = str.lastIndexOf("");
        System.out.println("空字符串在字符串str中的索引位置是："+size);
        System.out.println("字符串str的长度是"+str.length());
        System.out.println("带空格在字符串str的最后一次出现的索引位置是"+str.lastIndexOf(" "));
    }
}
