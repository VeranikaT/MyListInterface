package by.epam.ld.nb.main;

import java.util.Comparator;

public interface MyList<T> {

    void add(T obj);

    void add(int i, T obj);

    void remove();

    void remove(int i);

    void sort();

    void sort(Comparator<? super T> comparator);

}