package org.example.org.sll;

public class SinglyLinkedList {

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        displayList(sll.head);
        System.out.println(getCountOfSll(sll.head));
    }

    private static void displayList(ListNode head) {
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(temp);
    }

    private static int getCountOfSll(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;

        }
        return count;
    }

}