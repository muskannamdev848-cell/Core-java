package JavaCollectionFramework;

import java.util.Comparator;

public class WeightComparator implements Comparator<Stud> {
    @Override
    public int compare(Stud o1, Stud o2) {
        //return o1.weight - o2.weight;
        //or
        return Integer.compare(o1.weight,o2.weight);
    }
}
