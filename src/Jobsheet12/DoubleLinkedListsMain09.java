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
    }
}
