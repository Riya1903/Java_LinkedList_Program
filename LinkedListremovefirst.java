public class LinkedListremovefirst {
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
    public static int removefirst()
    {
        if(size==0)
        {
            System.out.println("LinkedList is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
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
    LinkedListremovefirst l=new LinkedListremovefirst();
 l.addfirst(1);
 l.addfirst(2);
 l.addfirst(3);


 l.print();
 System.out.println(l.size);
 l.removefirst();
 System.out.println(l.size);

}
}