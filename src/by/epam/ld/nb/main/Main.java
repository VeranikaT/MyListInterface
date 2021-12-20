package by.epam.ld.nb.main;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Mark i = new Mark<Integer>();

        i.add(10);
        i.add(4, 100);
        i.add(5);
        i.add(20);
        i.remove();
        i.remove(0);
        System.out.println(i.toString());
    }
}
