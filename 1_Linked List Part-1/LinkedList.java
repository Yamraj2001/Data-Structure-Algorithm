import java.util.List;

public class LinkedList{
    // 1. Introduction to Linked List
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // 2. Head & Tail in LL
    public static Node head;
    public static Node tail;

     // 3. Add First in LL
     public void addFirst(int data){
        //step1 : craere new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 : newNode next = head
        newNode = head; //link

        //step3 : head = newNode
        head = newNode;
     }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        ll.addFirst(1);
        ll.addFirst(2);
    }
}