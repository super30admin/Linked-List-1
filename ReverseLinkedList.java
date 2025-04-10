 // TC: O(N)
 // SC: O(1)
class Solution {
    ListNode result;
    public ListNode reverseList(ListNode head) {
       

       helper(head);
       return result;
       
    }

    private void helper(ListNode head) {
        if(head == null || head.next == null ) {
        result = head;
        return;
        }
        helper(head.next);
        head.next.next = head;
         head.next = null;

    }
}