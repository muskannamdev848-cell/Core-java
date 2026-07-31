package JavaCollectionFramework;

import java.util.Comparator;

public class ReverseCmp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return - Integer.compare(o1,o2); //negative sign -> negative ko positive and positive ko negative karne ke liye
    }
}
