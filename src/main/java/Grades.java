public class Grades {
    public int[] grades;
    public int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void back() {
        System.out.println("ostatnio dodana ocena: " + this.grades[this.size]);
    }



    public void countAverage() {
        double result = 0;
        int sumOfGrades = 0;
        for (this.size = 0; this.size < 10; this.size++) {
            sumOfGrades += this.grades[this.size];
            result = sumOfGrades / grades.length;
            System.out.println("Średnia ocen wynosi: " + result);

            }

        }
    }




