/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast = head;
        ListNode slow = head;
        while(n >0) {
            
            n--;
            fast = fast.next;
        }
        
        // edge case when trying to remove the head node
        // move head to head.next and return 
        // sample test case 
        // input list  : [1,2,3,4,5]  n =  5 
        // output list : [2,3,4,5]
        
        
        
        if(fast == null) {
            head = head.next;
            return head;
        }
        
        // move fast and slow pointer to gether until fast reaches last node
        // when fast reaches last node slow pointer reaches the node before the "Node" we want to delete.
        while(fast.next != null)
        {
            fast = fast.next;
            slow =slow.next;
        }
       
        slow.next = slow.next.next;
        
        
        return head;
    }
}
