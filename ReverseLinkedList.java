// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : After reversing the head should be the last node and it should be pointed to null. So we create a dummy node and assign head to it and increment
// head along with the pointer on the dummy node and continue until we reach the end.

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // dummy node

        while (head != null) { //loop until end
            ListNode temp = head.next; //temp to store next
            head.next = prev; //point next to prev so that it's reversed
            prev = head; //move prev forward
            head = temp; //move head forward
        }
        return prev;
    }
}