public class Dane {
    public String[] person;
    public int[] age;
    public int result = 0;
    int numberOfElements2 = age.length;
    int i = 0; //czy trzeba go definiować?

    public Dane() {
        this.person = new String[4];
        this.age = new int[4];
    }

    public int sumOfAgeAndAverage(int result) {
        int ageSum = 0;
        for (int i = 0; i < numberOfElements2; i++) {
            ageSum += this.age[i];
            if (int i == numberOfElements2) {
                result = ageSum / numberOfElements2;
                return result; //?? wstawienie tego nie pomogło

            }
        }
    } // o co tu chodzi???

        public void checkAndPrintName () {
            for (int i = 0; i < numberOfElements2; i++) {
                if (this.age[i] < result) {
                    System.out.println("Wiek tej osoby jest mniejszy od średniej wieku grupy:   " + this.person[i]);

                }
            }
        }
    }




