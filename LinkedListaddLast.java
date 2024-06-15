public class LinkedListaddLast {


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
        
        public void addlast(int data)
        { 
            //step 1-create a newnode
            Node newnode=new Node(data);
            if(head==null)
            {
                head=tail=newnode;
                return;
            }
            //step 2-tail next=newnode
            tail.next=newnode;
            //step 3-tail=newnode
            tail=newnode;
    
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
     LinkedListaddLast l=new LinkedListaddLast();
     l.addlast(1);
     l.addlast(2);
     l.print();
    }
}
