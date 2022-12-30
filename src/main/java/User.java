
public class User {


    public static void main(String[] args) {
        Dane dane = new Dane();

        dane.person[0] = "Harley";
        dane.person[1] = "Tosia";
        dane.person[2] = "Picasso";
        dane.person[3] = "Jackie";

        dane.age[0] = 9;
        dane.age[1] = 2;
        dane.age[2] = 8;
        dane.age[3] = 1;

        dane.sumOfAgeAndAverage();
        System.out.println("To jest średnia wieku:   " + dane.result); // jaka jest przyjęta konwencja dobrego programowania: czy to też powinna byc metoda void
        // w pliku Dane, czy polecenie wydruku w pliku głównym?
        dane.checkAndPrintName();

            }

}


