public class LeapYear {
    public static void main(String[] args) {
        int yearNumber1 = 3001;
        if (yearNumber1 % 4 != 0) {
            System.out.println(yearNumber1);
            System.out.println("Ten rok jest nieprzestepny 1");
        } else if (yearNumber1 % 100 != 0) {
            System.out.println(yearNumber1);
            System.out.println("Ten rok jest przestepny Hurra!2");
        } else if (yearNumber1 % 400 != 0) {
            System.out.println(yearNumber1);
            System.out.println("Ten rok jest nieprzestepny 3");
        } else {
            System.out.println(yearNumber1);
            System.out.println("Ten rok jest przestepny :)");
        }
    }
}
