package Jobsheet10;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;

        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;

        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);

        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");

        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;

            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");

        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh. Program berhenti.");
            System.exit(1);

        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;

            }

        }
        data[rear] = dt;
        size++;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong. Program berhenti.");
            System.exit(1);
            return -1;

        } else {
            int dt = data[front];
            size--;
            if (size == 0) {
                front = rear = -1;

            } else {
                front = (front + 1) % max;
            }
            return dt;
        }
    }
}
