package Jobsheet12;

public class DoubleLinkedListsMain09 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedLists09 dll = new DoubleLinkedLists09();
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.addFirst09(3);
        dll.addLast09(4);
        dll.addFirst09(7);
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.add09(40, 1);
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.clear09();
        dll.print09();
        System.out.println("Size : " + dll.size);

        dll.addLast09(50);
        dll.addLast09(40);
        dll.addLast09(10);
        dll.addLast09(20);
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.removeFirst09();
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.removeLast09();
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.remove09(1);
        dll.print09();
        System.out.println("Size : " + dll.size);

        System.out.println("Percobaan 3");
        dll.clear09();
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.addFirst09(3);
        dll.addLast09(4);
        dll.addFirst09(7);
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        dll.add09(40, 1);
        dll.print09();
        System.out.println("Size : " + dll.size);
        System.out.println("================================");

        System.out.println("Data awal pada Linked Lists adalah : " + dll.getFirst09());
        System.out.println("Data akhir pada Linked Lists adalah : " + dll.getLast09());
        System.out.println("Data indeks ke-1 pada Linked Lists adalah : " + dll.get09(1));
    }
}
