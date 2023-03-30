//Leetcode - 206
//TC - O(N)
//SC - O(1)
public class ReverseLL {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //3-pointers
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev=null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast!=null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }

    //Reverse using recursion TC,SC: O(N)
    /*public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
         ListNode reverse = reverseList(head.next);
         head.next.next = head;
         head.next = null;
         return reverse;
    }*/
}
