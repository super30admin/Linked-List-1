package LinkedList1;

/*Source Link: https://leetcode.com/problems/reverse-linked-list/
    -------------------------------------------------------------------------------------------------------
     Time complexity : o(n) 
     space complexity: o(1) 
     Did this code run successfully in leetcode : yes
     problems faces : No
 */
 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}
