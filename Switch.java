public class Switch {
    public static void main(String[] args) {
        String monthString = "";
        int month = 2;
        switch(month) {
            case 1:
                            monthString = "January";
                            break;
            case 2: monthString = "February";
                            break;
        }
        System.out.println(monthString);
    }
}
