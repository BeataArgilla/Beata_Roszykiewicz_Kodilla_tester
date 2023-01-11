package kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Annapurna", 10,5,"stamped"));
        stamps.add(new Stamp("Mont Everest", 10,5,"not stamped"));
        stamps.add(new Stamp("Manaslu", 10,5,"stamped"));
        stamps.add(new Stamp("K2", 10,5,"not stamped"));
        stamps.add(new Stamp("Czo Oju", 10,5,"stamped"));
        stamps.add(new Stamp("Broad Peak", 10,5,"stamped"));
        stamps.add(new Stamp("Dhaulagiri", 10,5,"stamped"));
        stamps.add(new Stamp("Nanga Parbat", 10,5,"stamped"));
        stamps.add(new Stamp("Lhotse", 10,5,"not stamped"));
        stamps.add(new Stamp("Kanczendzonga", 10,5,"stamped"));
        stamps.add(new Stamp("Makalu", 10,5,"stamped"));
        stamps.add(new Stamp("Sziszapangma", 10,5,"not stamped"));
        stamps.add(new Stamp("Gaszerbrum I", 10,5,"stamped"));
        stamps.add(new Stamp("Gaszerbrum II", 10,5,"stamped"));
        stamps.add(new Stamp("Annapurna", 10,5,"stamped"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
