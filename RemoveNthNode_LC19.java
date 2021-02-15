/**
Time: O(n) -- dummy is travelling till end of the enter
Space: O(1)

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
        if(head == null || n == 0)
            return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        ListNode result = dummy;
        dummy.next = head;
        //create a dummy pointer and traverse the list for n steps
        while(n > 0){
            dummy = dummy.next;
            n--;
        }
        
        //now traverse both pointers so curr reaches size - n
        while(dummy.next != null){
            dummy = dummy.next;
            curr = curr.next;
        }
        
        //delete the node
        curr.next = curr.next.next;
        return result.next;
    }
}