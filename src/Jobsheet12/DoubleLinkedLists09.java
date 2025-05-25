package Jobsheet12;

public class DoubleLinkedLists09 {
    Node09 head;
    int size;

    DoubleLinkedLists09() {
        head = null;
        size = 0;
    }

    public boolean isEmpty09() {
        return head == null;
    }

    public void addFirst09(int item) {
        if (isEmpty09()) {
            head = new Node09(null, item, head);
        } else {
            Node09 newNode = new Node09(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast09(int item) {
        if (isEmpty09()) {
            addFirst09(item);
        } else {
            Node09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node09 newNode = new Node09(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add09(int item, int index) throws Exception {
        if (isEmpty09()) {
            addFirst09(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else {
            Node09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node09 newNode = new Node09(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node09 newNode = new Node09(current.prev, item, current);
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size09() {
        return size;
    }

    public void clear09() {
        head = null;
        size = 0;
    }

    public void print09() {
        if (!isEmpty09()) {
            Node09 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
            System.out.println("Berhasil diisi..");
        } else {
            System.out.println("Linked lists kosong!");
        }
    }
}
