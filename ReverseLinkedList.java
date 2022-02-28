//TC: O(n)
//SC:O(1)
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null)
        {
            // store next before moving
            next = curr.next;
            //reverse
            curr.next = prev;

            //now
            prev = curr;
            curr = next;

        }

        head = prev;
        return prev;

    }

}