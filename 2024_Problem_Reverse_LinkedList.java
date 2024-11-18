//206. Reverse Linked List - https://leetcode.com/problems/reverse-linked-list/
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head == null) return null;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            //if temp is not initialized to curr.next, we might loose
            //the rest of the LL
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        //head of the reversed list is prev when curr reaches null(EOL)
        return prev;
    }

}