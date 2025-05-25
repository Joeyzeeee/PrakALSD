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

    public void removeFirst09() throws Exception {
        if (isEmpty09()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast09();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast09() throws Exception {
        if (isEmpty09()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node09 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove09(int index) throws Exception {
        if (isEmpty09() || index >= size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else if (index == 0) {
            removeFirst09();
        } else {
            Node09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst09() throws Exception {
        if (isEmpty09()) {
            throw new Exception("Linked List kosong!");
        }
        return head.data;
    }

    public int getLast09() throws Exception {
        if (isEmpty09()) {
            throw new Exception("Linked List kosong!");
        }
        Node09 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get09(int index) throws Exception {
        if (isEmpty09() || index >= size) {
            throw new Exception("Nilai indeks di luar batas!");
        }
        Node09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}

