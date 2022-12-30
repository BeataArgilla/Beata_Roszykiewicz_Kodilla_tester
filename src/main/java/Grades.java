public class Grades {

    public int[] grades;
    public int size;



    public Grades() {
            this.grades = new int[10];
            this.size = 0;
        }

        public void dodaj () {
            for (this.size = 0; this.size < 10; this.size++) {
                System.out.println("Ostatnio dodana ocena: " + this.grades[this.size]);
                System.out.println("=======================================");
                System.out.println(" ");

        if (this.size == 10) {
                return;

                }
            }
        }


        public void countAverage () {
            double result = 0;
            int sumOfGrades = 0;
            for (this.size = 0; this.size < 10; this.size++) {
                sumOfGrades += this.grades[this.size];
            }
            if (this.size ==10){
                result = sumOfGrades / grades.length;
                System.out.println("Średnia ocen wynosi: " + result);


            }

        }
    }





