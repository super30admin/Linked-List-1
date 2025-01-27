public class Problem2 {
    // Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        boolean hasCycle = false;
        //use 2 ptrs slow and fast to find the cyclic or not
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        //now if its cyclic then move the fast ptr to head and move until fast and slow are equal and speed would be same for both
        fast = head;
        while(slow != fast){
            slow= slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
