public class App {
    public static void main(String[] args) throws Exception {
        SortedIntList a = new SortedIntList(true);
        a.add(5);
        a.add(5);
        a.add(3);
        a.add(0);
        a.add(9);
        a.add(15);
        a.add(4);
        a.add(9);
        a.add(6);

        SortedIntList b = new SortedIntList(false);
        b.add(3);
        b.add(6);
        b.add(0);
        b.add(9);
        b.add(15);
        b.add(4);
        b.add(9);
        b.add(5);
        b.add(5);

        System.out.println(a.equals(b));
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
