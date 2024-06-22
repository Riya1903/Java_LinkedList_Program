public class checkpalindromLL {
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
    public Node FindMid(Node head)
    {
        Node slow =head;
        Node fast=head;
        while(fast!=null &&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public boolean checkpalindrome()
    {
        //step 1-find mid
        //step 2-second half
        //step 3-check left half and right half
        if(head==null||head.next==null)
        {
            return true;
        }
        //find middle
        Node mid=FindMid(head);
        //reverse 2nd half
        Node prev=null;
        Node curr=mid;
    
        while(curr!=null)
        {
             Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        }
    
    public static void main(String args[])
        {
         checkpalindromLL l=new checkpalindromLL();
         l.addfirst(1);
         l.addfirst(2);
         l.addfirst(3);
         l.addfirst(4);
         l.print();
        System.out.println(l.checkpalindrome());
         
        
        }
}
