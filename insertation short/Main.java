public class Main {
    public static void main(String[] args) {
        Insertion list = new Insertion();

        list.add(9);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(11);
        list.add(12);
        list.add(17);
        list.add(13);
        list.add(14);

        System.out.println("Data sebelum sorting:");
        list.listData();

        list.insertionSort();

        System.out.println("Data setelah sorting:");
        list.listData();
    }
}