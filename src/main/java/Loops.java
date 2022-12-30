public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------");
        for (int i = 0; i < numberOfElements; i++) {
                System.out.println(names[i]);
            }
        System.out.println("------------------------");
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        }
    }

