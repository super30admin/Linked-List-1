// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Understood


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        boolean flag = false;
        //fast goes 2 times speed through the linkedlist and when they meet flag becomes true, if fast.next is null, it means there is no cycle
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        ///no cycle return null
        if(!flag) return null;
        
        //if cycle exists, start fast point back to head and move then at 1X speed and they will meet at the valid node
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
}