import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int v){
        data = v;
        next = null;
    }
}
public class MergedSortedLinkedList{
    Node head;

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Node head1 = new Node(sc.nextInt());
        Node trail1 = head1;
        for(int i = 0;i < n-1 ;i++){
            trail1.next = new Node(sc.nextInt());
            trail1= trail1.next;
        }
        Node head2 = new Node(sc.nextInt());
        Node trail2 = head2;
        for(int i = 0;i < m-1 ;i++){
            trail2.next = new Node(sc.nextInt());
            trail2= trail2.next;
        }
        
        Node head = sortedMerge(head1,head2);
        printList(head);
    }
    static Node sortedMerge(Node head1, Node head2) {
        if(head1 == null) return head2;
            if(head2 == null) return head1;
             
            if(head1.data < head2.data)
            {
                head1.next = sortedMerge(head1.next, head2);
                return head1;
            }
            else
            {
                head2.next = sortedMerge(head1, head2.next);
                return head2;
            }
             
       }
}
// Input:
// N = 2, M = 2
// valueN[] = {1,1}
// valueM[] = {2,4}
 // Output:1 1 2 4

// Input:
// N = 4, M = 3 
// valueN[] = {5,10,15,40}
// valueM[] = {2,3,20}
// Output: 2 3 5 10 15 20 40'