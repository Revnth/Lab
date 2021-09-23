import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Linklist
{
 static Link first;
 static class Link 
 {
  int data;
  Link next;
  Link first;
  Link(int d)
  {
   data=d;
   next=null;
   first=null;
  }
 }
public static Link insert(int data)
{ 
 Link li=null;
 Link new_link = new Link(data);
 new_link.next = null;
 if(first == null)
 {
  first = new_link;
 }
else
{
 Link last =first;
 while(last.next != null)
 {
  last = last.next;
 }
 last.next = new_link;
 }
 return li;
}
public static void printList()
{
 Link li;
 Link current =first;
 System.out.print("Linkedlist:");
 while(current != null)
 {
  System.out.print(current.data+" ");
  current=current.next;
 }
System.out.println();
}
static Link removeLastLink(Link first)
{
 if(first == null)
  return null;
 if(first.next == null)
 {
  return null;
 }
Link prev = first;
while( prev.next.next != null)
 prev = prev.next;
prev.next=null;
return first;
}
public static void main(String[] args) 
{
 Linklist l = new Linklist();
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the total Nodes:");
 int n=sc.nextInt();
 for(int i=0;i<n;i++)
 {
  System.out.print("Enter element"+(i+1)+":");
  int a=sc.nextInt();
  l.insert(a);
 }
System.out.println("Enter the choice:");
System.out.println("1.Average of middle 2 elements 2.Delete last Node 3. Swap given positions");
int choice=sc.nextInt();
switch(choice)
{
 case 1:
    {
     Link current =l.first;
     for(int i=0;i<(n/2)-1;i++)
     {
      current = current.next;
     }
    int b = current.data;
    current = current.next;
    int c =current.data;
    System.out.println("Average of 2 middle elements = "+((b+c)/2));
    }
    break;
 case 2:
    {
     l.first=removeLastLink(l.first);
     l.printList();
    }
    break;
 case 3:
    {
     System.out.println("Enter the positions to swap:");
     int i = sc.nextInt();
     int j=sc.nextInt();
     Link ithlink=l.first , jthlink=l.first;
     for(int link=0;link<i;link++)
     {
      ithlink=ithlink.next;
     }
     for(int link=0;link<j;link++)
     {
      jthlink=jthlink.next;
     }
     int temp = ithlink.data;
     ithlink.data = jthlink.data;
     jthlink.data = temp;
     l.printList();
     }
     break;
    }
   }
  };