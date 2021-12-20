package by.epam.ld.nb.main;

import java.util.Comparator;
import java.util.List;

public interface MyList<T extends Number & Comparable<T>>{
    void add(T obj);
    void add(int index, T obj);
    void remove();
    void remove(int index);
    void sort();
    void sort(Comparator comparator);

}