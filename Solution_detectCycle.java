//TC: O(n)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_detectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        if(head.next == head)
            return head;

        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        fast = head;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
