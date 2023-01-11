package kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    public String stampName;
    public int stampWidth;

    public int stampHeight;
    String isStamped;

    public Stamp(String stampName, int stampWidth, int stampHeight, String isStamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;
        this.isStamped = isStamped;
    }

    public int getStampHeight() {
        return stampHeight;
    }

    public int getStampWidth() {
        return stampWidth;
    }

    public String isStamped() { // po co są te metody, skoro never used? to samo jest w Order (w zadaniu domowym)
        return isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return stampWidth == stamp.stampWidth && stampHeight == stamp.stampHeight && stampName.equals(stamp.stampName) && isStamped.equals(stamp.isStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", isStamped='" + isStamped + '\'' +
                '}';
    }
}
