/**
T: O(n) 
S: O(1)
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
        if(head == null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        //find the node where they meet
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }                
        }
        
        //if there is no cycle, flag would be false, just retutn
        if(!flag) return null;
        
        //start from the beginning 
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}