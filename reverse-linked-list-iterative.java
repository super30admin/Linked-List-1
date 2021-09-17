//Time complexity : O(n)
//Space complexity : O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        //curr pointer will point to head
        ListNode curr = head;
        while(curr != null) {
            //temp pointer will point to curr.next
            ListNode temp = curr.next;
            //curr.next point now will point to previous
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}