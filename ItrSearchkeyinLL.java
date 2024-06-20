public class ItrSearchkeyinLL {
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
public int itrSearch(int key)
{
    Node temp=head;
    int i=0;
    while(temp!=null)
    {
        if(temp.data==key)
        {
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
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

public static void main(String args[]){
    ItrSearchkeyinLL l=new ItrSearchkeyinLL();
         l.addfirst(1);
         l.addfirst(2);
         l.addfirst(3);
         l.addfirst(4);
         l.print();
         System.out.println(l.itrSearch(3));
         System.out.println(l.itrSearch(10));

}
}
