/* 
Time Complexity: O(N), where N is # of nodes in the list 
Space Complexity: O(1)

Passed All Test Cases 

Sol: 

Used dummy node to handle smaller cases like list with two or less than two nodes. 
We move the fast pointer until slow and fast pointer have difference of n nodes in them.
Then, we linearly iterate until the fast hits null.
At this point, slow pointer points to a node prev to the node at position n, so we set the slow.next = slow.next.next 
*/



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //edge case 
        if(head == null || head.next == null) return null ; 
        
        ListNode dummy = new ListNode(-1) ; 
        dummy.next = head ; 
        
        ListNode slow = dummy ; 
        ListNode fast = dummy ; 
        while(n-- >= 0) {
            fast = fast.next ; 
        }
        
        while(fast != null) {
            fast = fast.next ; 
            slow = slow.next ; 
        }
        
        slow.next = slow.next.next ; 
        
        return dummy.next ; 
    }
}