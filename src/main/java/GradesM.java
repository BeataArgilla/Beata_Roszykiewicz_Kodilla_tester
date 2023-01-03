public class GradesM {
//Celem zadania jest utworzenie klasy Grades, która będzie przechowywać 10 ocen ucznia. Klasa powinna zawierać 3 metody:
//
//    dodającą przekazaną w argumencie ocenę do tablicy,
//    zwracającą ostatnio dodaną ocenę,
//    zwracającą średnią ocen.
    public static void main(String[] args) {

        Grades stopien = new Grades();
        stopien.grades[0] = 5;
        stopien.grades[1] = 2;
        stopien.grades[2] = 1;
        stopien.grades[3] = 5;
        stopien.grades[4] = 4;
        stopien.grades[5] = 5;
        stopien.grades[6] = 3;
        stopien.grades[7] = 5;
        stopien.grades[8] = 1;
        stopien.grades[9] = 5;

        stopien.dodaj();
        stopien.countAverage();


    }
}
