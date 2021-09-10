/*

Time: O(n)
Space: O(1)


*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if (head == null)  return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        boolean flag = false;
        
        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
        
    }
}