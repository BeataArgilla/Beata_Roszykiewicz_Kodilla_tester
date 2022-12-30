public class Application2 {
    String name = "Adam"; /// gdzie powinny być dane startowe, w plik z main? czy tutaj? wg mnie lepiej w main
    double age = 40.5;
    double height = 178;

    public void printInfo() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
