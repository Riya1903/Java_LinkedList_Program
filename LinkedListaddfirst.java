public class LinkedListaddfirst {

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
 LinkedListaddfirst l=new LinkedListaddfirst();
 l.addfirst(1);
 l.addfirst(2);

 l.print();
 System.out.println(l.size);
}
}
