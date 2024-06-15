public class LinkedListaddmid {
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
        public void addfirst(int data)
        { 
            //step 1-create a newnode
            Node newnode=new Node(data);
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
    public void addmid(int idx,int data)
    { 
        //step 1-create a newnode
        if(idx==0)
        {
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1)
        {
            head=tail=newnode;
            return;
        }
        //i=idx-1;
        //temp->prev
        newnode.next=temp.next;
        //step 3-head=newnode
        temp.next=newnode;

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
         LinkedListaddmid l=new LinkedListaddmid();
         l.addfirst(1);
         l.addfirst(2);
         l.addfirst(3);
         l.addfirst(4);
         l.print();
         
         l.addmid(1,5);
         l.print();
         l.addmid(2,9);
          l.print();
        }
        }

