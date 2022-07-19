//Time complexity : O(n)
//Space complexity : O(1)
//time limit exceeded
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null ) return null;
        boolean hascycle = false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow = head.next;
            fast = fast.next.next;
            if(slow == fast){
                hascycle = true;
                break;
            }
        }

        if(!hascycle) return null;
        slow = head;

        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
