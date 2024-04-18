package LinkedList;


public class LinkedList3 {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode currrent = head;
        while (currrent != null) {
            System.out.print(currrent.data+" -> ");
            currrent= currrent.next;
        }
        System.out.println("null");
    }

    public ListNode deleteFirstNode(){
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public boolean searchNode(ListNode head,int searchKey){
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;                
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList3 obj = new LinkedList3();
        obj.head = new ListNode(10);
        ListNode sec = new ListNode(11);
        ListNode thr = new ListNode(12);
        ListNode fou = new ListNode(13);

        obj.head.next = sec;
        sec.next = thr;
        thr.next = fou;
        obj.display();
        // obj.deleteFirstNode();
        if(obj.searchNode(obj.head,11)){
            System.out.println("hi");
        }
        obj.display();
    }
}
