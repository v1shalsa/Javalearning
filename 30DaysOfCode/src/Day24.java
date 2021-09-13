import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class NodeLink {
    int data;
    NodeLink next;
    NodeLink(int d){
        data=d;
        next=null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeLink nodeLink = (NodeLink) o;
        return data == nodeLink.data; //&& Objects.equals(next, nodeLink.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}

public class Day24 {

    public static NodeLink removeDuplicates(NodeLink head) {
        //Write your code here
        //Set<NodeLink> dups = new LinkedHashSet<>();

        //while(head!=null){
        //    dups.add(head);
        //    head = head.next;
        //}
        Set<Integer> nodups = new LinkedHashSet<>();
        while(head!=null){
            nodups.add(head.data);
            head = head.next;
        }
        NodeLink newhead = null;
        int[] newnos = nodups.stream().mapToInt(i->i.intValue()).toArray();
        for (int i=0;i<newnos.length;i++) {
            newhead = insert(newhead, newnos[i]);
        }
        return newhead;
        //nodups.stream().forEach(System.out::println);

    }

    public static NodeLink insert(NodeLink head, int data) {
        NodeLink p = new NodeLink(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            NodeLink start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(NodeLink head) {
        NodeLink start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeLink head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);
        //removeDuplicates(head);
    }
}