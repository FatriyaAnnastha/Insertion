public class Main {
    public static void main(String[] args) {
        Insertion list = new Insertion();

        list.addlast(9);
        list.addlast(2);
        list.addlast(5);
        list.addlast(1);
        list.addlast(3);
        list.addlast(4);
        list.addlast(11);
        list.addlast(12);
        list.addlast(17);
        list.addlast(13);
        list.addlast(14);

        System.out.println("Data sebelum sorting:");
        list.listData();

        list.insertionSort();

        System.out.println("Data setelah sorting:");
        list.listData();
    }
}