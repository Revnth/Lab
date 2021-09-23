import java.io.*;
public class SinglyLinkedlist
{
 class Node
 {
  int data;
  Node next;
  public Node(int d)
  {
   this.data=d;
   this.next=null;
  }
 }
 public Node head= null;
 public Node tail= null;
 public void addnode(int data)
 {
  Node newnode= new Node(data);
  if(head==null)
  { 
   head= newnode;
   tail= newnode;
  }
  else
  {
   tail.next=newnode;
   tail=newnode;
  }
 }
 public void display()
 {
  Node current=head;
  if(head==null)
  {
   System.out.println("List is Empty");
   return;
  }
  System.out.println("Nodes of Singly Linkedlist: ");
  while(current!=null)
  {
   System.out.println(current.data+" ");
   current=current.next;
  }
 }
 public void delete()
 {
  if(head==null)
  {
   System.out.println("List is Empty");
   return;
  }
  System.out.println("Deleted");
  Node temp=head;
  while(temp.next!=tail)
   temp=temp.next;
  temp.next=null;
  tail=temp;
 }
 public double average()
 {
  int count=0,mid;
  double avg;
  Node temp=head;
  if(head!=null)
  {
   while(temp.next!=null)
   {
    ++count;
    temp=temp.next;
   }
  }
  temp=head;
  mid=count/2;
  while(mid!=0)
  {
   temp=temp.next;
   mid--;
  }
  avg=(temp.data+temp.next.data)/2.0;
  return avg;
 }
 public void swap(int pos1,int pos2)
 {
  Node link1,link2;
  link1=head;
  link2=head;
  int i,temp;
  for( i=1;i<pos1;++i)
   link1=link1.next;
  for(i=1;i<pos2;++i)
   link2=link2.next;
  temp=link1.data;
  link1.data=link2.data;
  link2.data=temp;
  System.out.println("Swapped\n");
 }
 public static void main(String s[]) throws IOException
 {
  SinglyLinkedlist lt=new SinglyLinkedlist();
  BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
  while(true)
  { 
   System.out.println("\n1:Add Node\n2:Average of middle 2 elements\n3:Delete last node\n4:Swap\n5:Display\n6:Exit\n");
   int ch=Integer.parseInt(k.readLine());
   switch(ch)
   { 
    case 1:
    System.out.println("Enter Value: ");
    int d=Integer.parseInt(k.readLine());
    lt.addnode(d);
    break;
    case 2:
    double avg=lt.average();
    System.out.println("Average: "+avg);
    break;
    case 3:  
    lt.delete();
    break;
    case 4:
    System.out.println("Enter 2 position to swap: ");
    int pos1=Integer.parseInt(k.readLine());
    int pos2=Integer.parseInt(k.readLine());
    lt.swap(pos1,pos2);
    break;
    case 5:
    lt.display();
    break;
    case 6:
    System.exit(0);
    break;
   }
  }
 }
}
  
