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
        System.out.println();
    }

    public void display(String text) {
        System.out.println(text);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
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

    public void addNodePosition(int data, int position) {
        ListNode newnode = new ListNode(data);
        if (position == 1) {
            newnode.next = head;
            head = newnode;
        }
        if (position > 1) {
            ListNode prevesNode = head;
            int count = 1;
            while (count < position - 1) {
                prevesNode = prevesNode.next;
                count++;
            }
            ListNode current = prevesNode.next;
            newnode.next = current;
            prevesNode.next = newnode;
        }
    }

    public void insert(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode temp = previous.next;
            previous.next = newNode;
            newNode.next = temp;
        }
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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
        sll.insertLast(1111);

        sll.display();
        sll.addNodePosition(00, 3);
        sll.insert(1000, 1);
        sll.display("After Insert 1000 in 1 position");
        sll.deleteFirst();
        sll.display("After deleting First Node ");
    }
}
