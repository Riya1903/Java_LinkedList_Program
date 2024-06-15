import java.util.*;
public class LinkedList {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        public static Node head;
        public static Node tail;
        public static int size;
    }
    private LinkedList.Node head;
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        System.out.println(ll);

    }
    public void addFirst(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
    }
    public void Firstadd(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Firstadd'");
    }

}
