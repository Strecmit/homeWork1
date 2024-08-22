package tree;

import human.Human;

import java.util.Comparator;

public class HumanComparatorByName<T extends TreeConn<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
