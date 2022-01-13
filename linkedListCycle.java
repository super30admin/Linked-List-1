/*
Time complexity : O(n)
Space complexity: O(1)
*/
public class linkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head; //1x speed
        ListNode fast = head; //2x speed
        boolean flag = false;
        // to find where both slow and fast meet
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        //to find the head of the cycle
        fast = head;
        while(fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}