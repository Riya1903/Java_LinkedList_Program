public class DLinkedListaddfirst {
    public class Node{
        int data;
        Node next;
        Node prev;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
   }
    public static Node head;
    public static Node tail;
    public static int size;
    //add
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
        }
        else{
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        }
        size++;
       }
public void print()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"<->");
        temp=temp.next;
    }
    System.out.println("null");
}

 public static void main(String[] args) {
        DLinkedListaddfirst dll=new DLinkedListaddfirst();
        dll.addfirst(1);
        dll.addfirst(2);
        dll.addfirst(3);
        dll.addfirst(4);
        dll.addfirst(5);
        dll.addfirst(6);
        dll.print();
    }
}

