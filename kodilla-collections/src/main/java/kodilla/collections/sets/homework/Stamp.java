package kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    public String stampName;
    public int stampWidth;

    public int stampHeight;
    boolean stamped;

    public Stamp(String stampName, int stampWidth, int stampHeight, boolean stamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;
        this.stamped = stamped;
    }

    public int getStampHeight() {
        return stampHeight;
    }
    public void setStamped(boolean stamped) {
        if (stamped){
            System.out.println("Already stamped");
        } else{
            System.out.println("Not stamped yet");
        }
    }

    public int getStampWidth() {
        return stampWidth;
    }


    public String getStampName() {
        return stampName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth && stampHeight == stamp.stampHeight && stamped == stamp.stamped && stampName.equals(stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", isStamped='" + stamped + '\'' +
                '}';
    }
}


