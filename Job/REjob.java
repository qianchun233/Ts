public class REjob {
    public static void main(String[] args) {
        String x = "([1]{1})+\\d+\\d+\\d+\\d+\\d+\\d+\\d+\\d+\\d+\\d+";
        String text = "18576468322";
        if (text.matches(x)) {
            System.out.println("是合法电话号");
        } else {
            System.out.println("不是合法电话号");
        }
    }
}
