//TimeComplexity: O(N)
//Space Complexity: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head== null || head.next == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;

            if(fast == slow){
                slow = head;

                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}