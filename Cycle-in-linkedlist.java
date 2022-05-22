
public class Solution {
    // Floyds algorithm
    // Time complexity is O(n)
    // Space complexity is O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        //edge case
        if (head == null || head.next == null) return null;
        // Detecting cycle first
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        // Detecting which node is the cycle
        slow = head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}