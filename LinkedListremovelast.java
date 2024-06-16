public class LinkedListremovelast {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
    
    public void addfirst(int data)
    { 
        //step 1-create a newnod
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        //step 2-newnode next=head
        newnode.next=head;
        //step 3-head=newnode
        head=newnode;

    }
    public static int removeLast()
    {
        if(size==0)
        {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++)
        {
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public void print()
        {
            Node temp=head;
            if(head==null)
            {
                System.out.println("linkedList is empty");
                return;
            }
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
public static void main(String args[])
{
    LinkedListremovelast l=new LinkedListremovelast();
 l.addfirst(1);
 l.addfirst(2);
 l.addfirst(3);
 l.print();
 System.out.println(l.size);
 l.removeLast();
 System.out.println(l.size);
}
}
