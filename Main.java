import java.util.*;
class Linkedlist{
    Node head,tail;

    class Node{
        int data;
        Node next;
        Node(int d){
        data=d;
        next=null;
        }
    }
    public void insert(int d){
        Node newnode=new Node(d);
        if(head==null&&tail==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }

    public void reverse(int k){
    Node temp=head;
    String s="";
    String ans="";
    int f=0;
    while(temp!=null){
        s+=Integer.toString(temp.data);
        f++;
        if(f==k||temp.next==null){
            f=0;
            StringBuffer sb=new StringBuffer(s);
            String s1=new String(sb.reverse());
            ans+=s1;
        }    
        if(temp.next==null){
            break;
        }
        temp=temp.next;
    }
    System.out.println(ans);
}
    }

public class Main{
public static void main(String args[]){
    Linkedlist lst=new Linkedlist();
    lst.insert(1);
    lst.insert(2);
    lst.insert(3);
    lst.insert(4);
    lst.insert(5);
    lst.insert(6);
    lst.insert(7);
    lst.insert(8);
    
    lst.reverse(3);
    

}
}