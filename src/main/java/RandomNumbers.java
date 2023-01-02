import java.util.Random;

public class RandomNumbers {


    public void minAndMaxNumbers() {
        Random random = new Random();
        int sumamax = 5000;
        int range = 31;
        int min =30;
        int max =0;
        for (int sum = 0; sum <= sumamax; sum++) {
            int temp = random.nextInt(range);
            System.out.println(" to jest temp :" + temp);
            if (max < temp) max = temp;
            System.out.println(" to jest max :" + max);
            if (min > temp) min = temp;
            System.out.println(" to jest min :" + min);
            sum = sum + temp;
            System.out.println(" to jest suma :" + sum);


        }
    }
}


