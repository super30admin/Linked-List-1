/*

Time: O(N), where N is # of nodes in list 
Space: O(1)
Passed All Test Cases

First using two pointers, we detect if there is a cycle or not, then we set the slow pointer to head and iterate linearly until both of pointers meet.
That is where the linkedlist cycle node is  
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //edge case 
        if(head == null || head.next == null) return null ; 
        
        ListNode fast = head ; 
        ListNode slow = head ; 
        
        while(fast != null && fast.next != null) {
            fast = fast.next.next ; 
            slow = slow.next ; 
            if(fast == slow) {
                slow = head ; 
                break ; 
            }
        }
        
        if(fast == null || fast.next == null)
            return null ; 
        
        while(fast != slow) {
            slow = slow.next ; 
            fast = fast.next ; 
        }
        
        return slow; 
    }
}