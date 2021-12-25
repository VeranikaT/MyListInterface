package by.epam.ld.nb.main;

import java.util.Objects;

public class Mark<T extends Number> implements Comparable<Mark<T>> {

    private T mark;

    public Mark(T mark) {
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark<?> mark1 = (Mark<?>) o;
        return Objects.equals(mark, mark1.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark);
    }

    @Override
    public String toString() {
        return "" + mark;
    }

    @Override
    public int compareTo(Mark<T> o) {
        double m1 = mark.doubleValue();
        double m2 = o.mark.doubleValue();
        return (int) (m1 - m2);
    }

}
