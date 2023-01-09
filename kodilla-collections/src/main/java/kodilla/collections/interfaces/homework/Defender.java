package kodilla.collections.interfaces.homework;

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
    public void decreaseSpeed() {
        if (decreaseSpeed < 0) {
            temp2 = temp2 + decreaseSpeed;
        }

    }
}
