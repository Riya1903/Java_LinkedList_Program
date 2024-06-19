public class zigzagLL {
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
    public void zigzag()
    {
        //find mid
        Node slow =head;
        Node fast=head.next;
        while(fast!=null &&fast.next!=null)
        {
            slow =slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null)
        {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
        //alt merge-zig-zag merge
    }


    public static void main(String args[])
    { 
        zigzagLL zz=new zigzagLL();
        zz.addfirst(1);
        zz.addfirst(2);
        zz.addfirst(3);
        zz.addfirst(4);
        zz.addfirst(5);
        zz.print();
        zz.zigzag();
        zz.print();

    }
}
