package by.epam.ld.nb.main;

import java.util.*;

public class Mark<T extends Number & Comparable<T>> implements MyList<T> {
    public List<T> markList;
    public T mark;

    public Mark() {
        markList = new ArrayList<T>();
    }

    public List<T> getMarkList() {
        return markList;
    }

    public void setMarkList(List<T> markList) {
        this.markList = markList;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    public void checkNull() {
        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i) == null) {
                markList.remove(i);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark<?> mark1 = (Mark<?>) o;
        return Objects.equals(markList, mark1.markList) && Objects.equals(mark, mark1.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markList, mark);
    }

    @Override
    public String toString() {
        return "MarkList=" + markList + ";";
    }

    @Override
    public void add(T mark) {
        this.mark = mark;
        markList.add(mark);
    }

    @Override
    public void add(int index, T mark) {
        if (index >= 0 && index <= markList.size()) {
            markList.add(index, mark);
            return;
        }
        int insertNulls = index - markList.size();
        for (int i = 0; i < insertNulls; i++) {
            markList.add(null);
        }
        markList.add(mark);
    }

    @Override
    public void remove() {
        markList.remove(markList.size() - 1);
    }

    @Override
    public void remove(int index) {
        markList.remove(index);
    }

    @Override
    public void sort() {
    }

    @Override
    public void sort(Comparator comparator) {

    }

}
