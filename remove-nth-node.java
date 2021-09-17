//Time complexity : O(n)
//Space complexity : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        //fast pointer advances to n+1 steps from the beginning
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        //advance both the pointer until fast != null
        //this will maintain n gap between two pointers
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //now, slow.next will point to slow.next.next removing the nth node
        slow.next = slow.next.next;
        return dummy.next;
      
    }
}