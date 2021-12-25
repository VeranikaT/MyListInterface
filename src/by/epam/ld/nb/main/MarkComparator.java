package by.epam.ld.nb.main;

import java.util.Comparator;

public class MarkComparator<T extends Number>  implements Comparator<Mark<T>>{

    @Override
    public int compare(Mark<T> o1, Mark<T> o2) {
        return o1.compareTo(o2);
    }
}
