//Time Complexity :- O(n)
//Space Complexity :- O(1)

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
        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;
        
        ListNode slow = dummy_head;
        ListNode fast = dummy_head;
        
        for(int i = 1; i <= n+1; i++){
            fast = fast.next;
        }   
        while(fast != null){
            slow = slow.next; 
            fast = fast.next;
           
        }
        
        slow.next = slow.next.next;
        return dummy_head.next;
    }
}