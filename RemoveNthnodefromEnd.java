public class RemoveNthnodefromEnd {
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
        public void deleteNthfromEnd(int n)
        {
            int size=0;
            Node temp=head;
            while(temp!=null)
            {
                temp=temp.next;
                size++;
            }
            if(n==size)
            {
                head=head.next;
                return;
        
            }
            //size-n
            int i=1;
            int iToFind=size-n;
            Node prev=head;
            while(i<iToFind)
            {
             prev=prev.next;
            i++;
            }
            prev.next=prev.next.next;
            i++;
            return;
        }
    public static void main(String args[])
    {
     RemoveNthnodefromEnd l=new RemoveNthnodefromEnd();
     l.addfirst(1);
     l.addfirst(2);
     l.addfirst(3);
     l.addfirst(4);
     l.print();
     l.deleteNthfromEnd(2);
     l.print();
}
}
