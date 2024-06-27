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

    public void reverse(){
        Node temp=head;
        Linkedlist lst2 =new Linkedlist();
        int n=0;
        while(temp!=null){
           n++;
           temp=temp.next;
        }
        int sub=n/2;
        Node temp2=head;
        for(int i=0;i<n;i++){
            if(i>sub){

                lst2.insert(temp2.data);
            }
            temp2=temp2.next;
        }

        String s="";
        for(int i=0;i<=sub;i++){
        
           s+=Integer.toString(head.data-tail.data)+"->";
           Node temp1=head;
           if(head!=tail){
           while(temp1.next!=tail){
            temp1=temp1.next;
           }
           temp1.next=null;
           tail=temp1;
           head=head.next;
          }
          else
          {
            break;
        }
    }
     System.out.print(s);    
     lst2.print();
     System.out.println("");
        
    }
}
public class List_sub{
public static void main(String args[]){
    Linkedlist lst=new Linkedlist();
    lst.insert(5);
    lst.insert(4);
    lst.insert(3);
    lst.insert(2);
    lst.insert(1);
    lst.reverse();
    

}
}