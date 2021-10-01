
/*
2.Write a menu driven program to perform the following on a Single Linked List
a.insertion at beginning
b.insertion at end
c.insert a node after a specific node
d.deletion from beginning
e.delete from end
f.delete from a particular position
*/

import java.io.*;

//link
class Link {
    public int data;
    public Link next;

    public Link(int d) {
        data = d;
       // this.next = null;
    }

    public void displayLink() {
        System.out.println(data);
    }

}

class LinkList // linkedlist
{
    private Link first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    // Insert link to the first
    public void insertFirst(int d) {
        Link nl = new Link(d);

        nl.next = first;
        first = nl;
    }

    // Insert Link to the end
    public void insertLast(int d) {
        Link nl = new Link(d);
        Link cur = first;
        if (isEmpty()) {
            first = nl;
            nl.next = null;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = nl;
            nl.next = null;
        }
    }
    // Insert at the position of a given value.

    public void insert(int key, int d) {
        Link cur = first;
        Link prev = first;
        Link newLink = new Link(d);

        while (cur.data != key) {
            if (cur.next == null) {
                System.out.println("Key not Found");
                break;
            } else {
                prev = cur;
                cur = cur.next;
            }

        }
        newLink.next = prev.next;
        prev.next = newLink;

    }

    // To delete the first element
    public int deleteFirst() {
        if (isEmpty()) {
            System.out.println("THE LIST IS EMPTY");
        }
        int temp = first.data;
        first = first.next;
        return temp;
    }
    // To delete the last element

    public int deleteLast() {
        Link cur = first;
        Link prev = first;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;

        }
        int temp = cur.data;
        prev.next = null;
        return temp;
    }

    // delete the link cotaining a key
    public Link delete(int key) {

        Link cur = first;
        Link prev = first;
        while (cur.data != key) {
            if (cur.next == null) {
                System.out.println("Key not Found");
                break;
            }

            else {
                prev = cur;
                cur = cur.next;
            }

        }

        if (cur == first)
            first = first.next;
        else
            prev.next = cur.next;
        return cur;

    }

    // display all elements

    public void displayList() {
        Link current = first;
        // if list is Empty
        if (isEmpty()) {
            System.out.println("THE LIST IS EMPTY");
        }
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

}

class singleLinkedlist {
    public static void main(String args[]) throws IOException {
        int choice, value, z;
        LinkList obj;
        obj = new LinkList();
        do {
            System.out.println("SINGLE LINKED LIST");
            System.out.println("1.INSERT FIRST");
            System.out.println("2.INSERT LAST");
            System.out.println("3.INSERT LINK");
            System.out.println("4.DELETE FIRST");
            System.out.println("5.DELETE LAST");
            System.out.println("6.DELETE LINK");
            System.out.println("7.DISPLAY ALL");

            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);
            choice = Integer.parseInt(in.readLine());

            switch (choice)

            {

            case 1:

                System.out.println("Enter the data to be inserted");
                value = Integer.parseInt(in.readLine());
                obj.insertFirst(value);
                break;
            case 2:
                System.out.println("Enter the data to be inserted");
                value = Integer.parseInt(in.readLine());
                obj.insertLast(value);
                break;
            case 3:
                System.out.println("Enter element to be inserted");
                value = Integer.parseInt(in.readLine());
                System.out.println("Enter the link list value");
                z = Integer.parseInt(in.readLine());
                obj.insert(z, value);
                break;
            case 4:
                int d = obj.deleteFirst();
                System.out.println(d + " is  deleted");

                break;

            case 5:
                int del = obj.deleteLast();
                System.out.println(del + " is  deleted");
                break;

            case 6:
                System.out.println("Enter the data to be deleted");
                value = Integer.parseInt(in.readLine());
                obj.delete(value);
                System.out.println("Deleted");
                break;

            case 7:
                System.out.println("Display all elements in the Link");
                obj.displayList();

                break;
            default:
                System.out.println("INVALID INPUT");
            }

        } while (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7);
    }
}
