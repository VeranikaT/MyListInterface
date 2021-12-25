package by.epam.ld.nb.main;

public class Main {
    public static void main(String[] args) {

        MarkList<Mark<Integer>> list = new MarkList<>();

        list.add(new Mark<>(1));
        list.add(new Mark<>(5));
        list.add(new Mark<>(10));
        list.add(new Mark<>(2));

        System.out.println(list.toString());

        list.add(1, new Mark<>(20));
        list.add(5, new Mark<>(33));

        System.out.println(list.toString());

        list.sort();

        list.remove();

        System.out.println(list.toString());

        list.remove(0);

        System.out.println(list.toString());

        list.add(new Mark<>(26));
        list.add(new Mark<>(12));
        list.add(new Mark<>(96));

        System.out.println(list.toString());

        list.sort(new MarkComparator<>());

        System.out.println(list.toString());

    }
}
