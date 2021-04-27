public class Opinion {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("ABC");
        String s3 = new String("abc");
        boolean b = s1.equals(s2);
        System.out.println(b);
        boolean b2 = s3.equalsIgnoreCase(s2);
        System.out.println(b2);
    }
}
