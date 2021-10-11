package Hacktoberfest;

import java.util.Scanner;

public class Queue {
    int max, size,front, rear;
    int [] Q;
    
    public Queue(int n){
        max = n;
        Create();
    }
    public void Create(){
        Q = new int [max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max){
            return true;
        }
        else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Leading element : " + Q[front]);
        }
        else {
            System.out.println("Queue still empty");
        }
    }
    public void print (){
        if(IsEmpty()){
            System.out.println("Queue still empty");
        }
        else{
            int i = front;
            while(i != rear){
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Number of element = " + size);
        }
    }
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue was emptied successfully");
        }
        else{
            System.out.println("Queue still empty");
        }
    }
    public void Enqueue(int data){
        if(IsFull()){
            System.out.println("Queue is full");
        }
        else{
            if(IsEmpty()){
                front = rear = 0;
            }
            else{
                if(rear == max -1){
                    rear = 0;
                }
                else{
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    public int Dequeue(){ 
        int data = 0;
        if(IsEmpty()){
            System.out.println("Queue still empty");
        }
        else{
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }
            else{
                if(front == max -1){
                   front = 0;
                }
                else{
                    front++;
                }
            }
        }
        return data;
    }
    public void peekPosition(int data){
        if(IsEmpty()){
            System.out.println("Queue still empty");
        }
        else{
            for(int i = 0;i<max;i++){
                if(Q[i] == data){
                    System.out.println("Score "+data+" is located in index "+i);
                }
            }
        }
    }
    public void peekAt(int position){
        if(IsEmpty()){
            System.out.println("Queue still empty");
        }
        else{
            for(int i = 0;i<max;i++){
                if(position == i){
                    System.out.println("Outgoing data = "+ Q[i]);
                }
            }
        }
    }
    public static void menu() {
        System.out.println("Enter the desired operation: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Position");
        System.out.println("7. Peek At");
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        int pilih;
        
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Enter new data: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2: 
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Issued data: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Enter numbers: ");
                    int nilai = sc.nextInt();
                    Q.peekPosition(nilai);
                    break;
                case 7:
                    System.out.print("Enter Position: ");
                    int posisi = sc.nextInt();
                    Q.peekAt(posisi);
                    break;
            }
        }
        while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);       
    }
}
