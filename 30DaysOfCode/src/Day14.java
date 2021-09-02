import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Day14 {

    public static Node insert(Node head, int data) {
        //Complete this method
        if(head==null){
            head = new Node(data);
            return head;
        }
        Node temp = head;
        Node last = new Node(0);
        while(temp!=null){
            last = temp;
            temp = temp.next;
        }
        Node nextnode = new Node(data);
        last.next = nextnode;
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();

    }
}