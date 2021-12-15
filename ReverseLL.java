public class ReverseLL {
    class ListNode {
        int val;
        ReverseLL.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
   /*

    TC: O(n)
    SC: O(1)

    */
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy=null;
        ListNode curr=head;
        ListNode fast=head.next;

        while(fast!=null){
            curr.next=dummy;
            dummy=curr;
            curr=fast;
            fast=fast.next;
        }

        curr.next=dummy;

        return curr;
    }
}
