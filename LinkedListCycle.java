// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//we will move slow pointer by one position and fast pointer by two,
//when they both reach at same node it means cycle is there,
//from that point will increase slow by one and we will increase pointer from head by one
//whenver they meet that is the entry  point of loop
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                ListNode dummy = head;
                while(slow!=dummy){
                    slow=slow.next;
                    dummy=dummy.next;
                }
                return dummy;
            }
        }
        return null;
        
    }
}
