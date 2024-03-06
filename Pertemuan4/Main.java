package Pertemuan4;

public class Main {
    static Node HEAD; // HEAD berisi data 9

    // Method untuk menambahkan node baru setelah posisi tertentu
    static void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Method untuk mencari posisi node yang dicari
    static Node findPositionNode(int position) {
        Node temp = HEAD;
        for (int i = 1; i < position; i++) {
            if (temp == null)
                break;
            temp = temp.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        // Inisialisasi HEAD
        HEAD = new Node(9);

        // Mengisi next dari HEAD dengan data 8, 7, 6
        HEAD.next = new Node(8);
        HEAD.next.next = new Node(7);
        HEAD.next.next.next = new Node(6);

        // Menambahkan node baru setelah posisi 1 (setelah HEAD)
        Node positionNode = findPositionNode(1);
        insertAfter(positionNode, 3);

        // Output semua nilai dari linked list
        Node temp = HEAD;
        while (temp != null) { 
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
}