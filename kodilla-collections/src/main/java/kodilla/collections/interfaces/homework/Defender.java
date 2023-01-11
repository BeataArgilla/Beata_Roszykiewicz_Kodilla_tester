package kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Defender implements Car {

    int increaseSpeed;
    int decreaseSpeed;
    int temp1 = 0;
    int temp2 = 0;

    public Defender(int increaseSpeed, int decreaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }
    @Override
    public int getSpeed() {
        return temp1 + temp2;
    }

    @Override
    public void increaseSpeed() {
        if (increaseSpeed > 0) {
            temp1 = temp1 + increaseSpeed;
        }


    }


    @Override
    public String toString() {
        return "Defender{" +
                "increaseSpeed=" + increaseSpeed +
                ", decreaseSpeed=" + decreaseSpeed +
                '}';
    }

    @Override
    public void decreaseSpeed() {
        if (decreaseSpeed < 0) {
            temp2 = temp2 + decreaseSpeed;
        }

    }

    @Override
    public boolean equals(Object o) {  //domyslam się ze porównuje, czy te same parametry, ze wykorzystuje inne metody. etc....
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Defender defender = (Defender) o;
        return increaseSpeed == defender.increaseSpeed && decreaseSpeed == defender.decreaseSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(increaseSpeed, decreaseSpeed);
    }
}
