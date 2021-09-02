/**
 * public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 *     ListNode dummyHead = new ListNode(0);
 *     ListNode p = l1, q = l2, curr = dummyHead;
 *     int carry = 0;
 *     while (p != null || q != null) {
 *         int x = (p != null) ? p.val : 0;
 *         int y = (q != null) ? q.val : 0;
 *         int sum = carry + x + y;
 *         carry = sum / 10;
 *         curr.next = new ListNode(sum % 10);
 *         curr = curr.next;
 *         if (p != null) p = p.next;
 *         if (q != null) q = q.next;
 *     }
 *     if (carry > 0) {
 *         curr.next = new ListNode(carry);
 *     }
 *     return dummyHead.next;
 * }
 */



/**
 * Definition for singly-linked list.
 * */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class AddTwoNumbers {

    public static void main(String[] args){
        ListNode it1 = new ListNode(1);
        ListNode it2 = new ListNode(2);
        it1.next = it2;
        it2.next = null;
        addtwonumbers(it1);
    }

    public static void addtwonumbers(ListNode l1){
        StringBuilder st = new StringBuilder();
        while(l1!=null)
        {
            st.append(String.valueOf(l1.val));
            l1 = l1.next;
        }
        System.out.println(st.toString());
        //StringBuilder st1 = new StringBuilder();
        //long sum = Integer.parseInt(st.toString())+Integer.parseInt(st1.toString());
        String.valueOf(st);
        //System.out.println(st.reverse());
        char[] nos = st.toString().toCharArray();
        int peek =0;
        int lastval = Integer.parseInt(String.valueOf(nos[peek]));
        ListNode last = new ListNode(lastval);
        last.next = null;
        peek++;
        ListNode l2 = generateList(last,nos,peek);

        //return null;
        st.delete(0, st.length());
        while(l2!=null)
        {
            st.append(String.valueOf(l2.val));
            l2 = l2.next;
        }
        System.out.println(st.toString());
    }

    public static ListNode generateList(ListNode last,char[] vals,int peek){

        if(vals.length==peek){
            return last;
        }
            ListNode nextnode = new ListNode();
            int val = Integer.parseInt(String.valueOf(vals[peek]));
            peek++;
            nextnode.val = val;
            nextnode.next = last;

        return generateList(nextnode,vals,peek);
    }
}
