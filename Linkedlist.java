import java.util.Scanner;

class Node{
    int data;
    Node next;
}

 class LL{
    Node head=null;

    public void Insert(int x)
    {
        Node node=new Node();
        node.data=x;
        node.next=null;


        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }

    public void show()
    {
        Node n=head;
       while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
         System.out.println(n.data);
    }

    public void Insertb(int a,int b)
    {
        Node n=head;
        Node node=new Node();
        node.data=a;
       
        if(n.data==b)
        {
            node.next=head;
            head=node;
        }
        else
        {
            while(n.next.data!=b)
            {
            n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }


    public void InsertA(int data,int num)
    {
        Node n=head;
        Node node=new Node();
        node.data=data;

        if(n.data==num)
        {
            node.next=n.next;
            n.next=node;
        }
        else
        {
            while(n.data!=num)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }

    public void delete(int x)
    {
        Node n=head;
        if(n.data==x)
        {
            head=n.next;
        }
        else
        {
            while(n.next.data!=x)
            {
                n=n.next;
            }
            n.next=n.next.next;
        }
    }
}




public class Linkedlist{
    public static void main(String[] args){
        LL list=new LL();
        list.Insert(5);
        list.Insert(10);
        list.Insert(15);
        list.InsertA(7,15);
        list.show();
    }
}