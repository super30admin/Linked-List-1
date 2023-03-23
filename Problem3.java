// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Maintain a slow and fast pointer. Fast moves at speed 2x and slow at speed x. 
 * If there is a cycle, the two pointers will meet at a point. 
 * To calculate the point, move slow again to head and traverse from fast until slow and fast meet. 
 * Point where they meet again is where it returns the cycle. 
 */
public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null; 
        ListNode slow = head; 
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next; 
            fast = fast.next.next; 
            if(slow == fast){
                flag = true; 
                break;
            }
        }  
        if(!flag)
            return null; 
        slow = head;
        while(slow != fast){
            slow = slow.next; 
            fast = fast.next;
        }
        return slow; 
    }
}