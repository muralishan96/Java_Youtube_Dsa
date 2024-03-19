package LinkedList;

public class RetrySingleList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void insertFirst(int data) {
        ListNode newnode = new ListNode(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        RetrySingleList sll = new RetrySingleList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(11);
        ListNode third = new ListNode(4);
        ListNode forth = new ListNode(4);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        // ListNode newNode = new ListNode(20);
        // newNode.next = sll.head;
        // sll.head = newNode;
        sll.insertFirst(99);

        sll.display();
        System.out.println();
        sll.insertLast(1111);

        sll.display();
    }
}
