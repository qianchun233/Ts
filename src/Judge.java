public class Judge {
    public static void main(String[] args) {
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1 = "aaa@";
        String str2 = "aaaaa";
        String str3 = "1111@111ffyu.dfg.com";
        if (str1.matches(regex)) {
            System.out.println(false);
        }
        if (str3.matches(regex)) {
            System.out.println(str3+"是合法邮件");
        }
    }
}

