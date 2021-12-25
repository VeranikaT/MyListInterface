package by.epam.ld.nb.main;

import java.util.Arrays;
import java.util.Comparator;

public class MarkList<T> implements MyList<T> {

    private Object[] m;
    private int index = 0;

    public MarkList() {
        m = new Object[0];
    }

    @Override
    public void add(T obj) {
        if (index >= m.length) {
            Object[] temp = m;
            m = new Object[temp.length + 1];
            System.arraycopy(temp, 0, m, 0, temp.length);
        }
        m[index] = obj;
        index++;
    }

    @Override
    public void add(int i, T obj) {
        if (index >= m.length) {
            Object[] temp = m;
            m = new Object[temp.length + 1];
            System.arraycopy(temp, 0, m, 0, i);
            int i2 = temp.length - i;
            System.arraycopy(temp, i, m, i + 1, i2);
        }
        m[i] = obj;
        index++;
    }

    @Override
    public void remove() {
        Object[] temp = m;
        m = new Object[temp.length - 1];
        System.arraycopy(temp, 0, m, 0, temp.length - 1);
        index--;
    }

    @Override
    public void remove(int i) {
        Object[] temp = m;
        m = new Object[temp.length - 1];
        System.arraycopy(temp, 0, m, 0, i);
        int i2 = temp.length - i - 1;
        System.arraycopy(temp, i + 1, m, i, i2);
        index--;
    }

    @Override
    public void sort() {
        Arrays.sort(m);
    }

    @Override
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort((T[]) m, comparator);
    }

    @Override
    public String toString() {
        return "MarkList: " + Arrays.toString(m) + ".";
    }

}
