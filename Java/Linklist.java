import java.io.*;

//Link
class Link {
    
        public int data;
        public Link next;
        public Link (int d){
            data=d;   
    }

    public void displayLink() {
        System.out.println(data);
    }
}

//Linked List
class LinkList
{
    private Link first;
    public LinkList()
    {
        first=null;
    }

    public boolean isEmpty()
    {
        return(first==null);
    }

//insert the link to the first position;
    public void insertFirst(int d)
    {
        Link nl = new Link(d);
        nl.next = first;
        first = nl;
    }

// delete the first element

public Link deleteFirst()
{
    Link temp = first;
    //if list is Empty
    if(isEmpty())
    {
        System.out.println("List is Empty");
    }
    first = first.next;
    return temp;

}

// display all elements

public void displayList()
{
    Link current = first;
     //if list is Empty
    if(isEmpty())
    {
        System.out.println("THE LIST IS EMPTY");
    }
    while(current!=null)
    {
        current.displayLink();
        current=current.next;
    }
}

// Find a specific link

public int find(int key)
{
    Link current = first;


int pos=1;
while(current.data!=key)
{
    if(current.next==null)
    return 0;
    else
    current = current.next;
    pos++;
}

return pos;
}

//delete link containing a key

public void delete(int key)
{
    Link cur =first;
    Link prev=first;

    while(cur.data!=key)
{
    if(cur.next==null)
    System.out.println("Key not found");
    else
    {
        prev=cur;
        cur = cur.next;
    }
   
}
if (cur==first)
first=first.next;
else
prev.next=cur.next;

}

//Insert at the position of a given value.

public void insert(int key, int d)
{
    Link cur =first;
    Link prev = first;
    Link newLink = new Link(d);

    while(cur.data!=key)
{
    if(cur.next==null)
    System.out.println("Key not Found");
    else
    {
        prev=cur;
        cur = cur.next;
    }
   
}
    newLink.next=prev.next;
    prev.next=newLink;

}

//insert at last
public void insertLast(int d)
{
    Link cur=first;
    Link nl =new Link(d);

    while(cur.next!=null)
    {
        cur=cur.next;
    }
    cur.next=nl;
    nl.next=null;

}


}


class SingleLinkedList
{
    public static void main(String args[])throws IOException {
      LinkList obj;
      obj = new LinkList();
      int x,value,value1;

      InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in=new BufferedReader(read);

      System.out.println("Single Linked List");
      do{
        System.out.println(" 1.Insert First \n 2.Delete First \n 3.Display all \n 4.Find the Link \n 5. Delete  Link \n 6.Insert Link") ; 
        x=Integer.parseInt(in.readLine());

        switch(x)
        {
            case 1:{
            System.out.println("Enter the data");
            value=Integer.parseInt(in.readLine());
            obj.insertFirst(value);
            break;
            }
            case 2:{
            obj.deleteFirst();
            System.out.println("Deleted");
            break;
            }
            case 3:{
            System.out.println("Display all elements in the list");
            obj.displayList();
            break;
            }
            case 4:{
            System.out.println("Enter the element to be found");
            value=Integer.parseInt(in.readLine());
            int y =obj.find(value);
            if(y==0)
            System.out.println("Key not found");
            else
            System.out.println("The element  is found at the position "+y);
            break;
            }
            case 5:{
            System.out.println("Enter the data to be deleted");
            value=Integer.parseInt(in.readLine());
            obj.delete(value);
            System.out.println("Deleted the data");
            break;
            }
            case 6:{
            System.out.println("Enter the data to be added");
            value=Integer.parseInt(in.readLine());
            System.out.println("Enter the linked list value ");
            value1=Integer.parseInt(in.readLine());
            obj.insert(value1,value);
            break;
            }
            default: System.out.println("Invalid input");
  
        }
  

      }while(x==1||x==2||x==3||x==4||x==5||x==6);
     
     
    }
    
}
