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

 /*
 Approach:
 -We need to remove the N-th node from the end of a singly linked list in one pass.
 -To do this efficiently, we use the **two-pointer-approach** (also known as fast and slow pointer).
 -We first advance the 'temp' (fast) pointer 'n' steps ahead .
 -Then we move both 'temp' and 'head' (slow pointer) together until temp reaches the last node
 -At this point tep will be right before the node to be removed.
 -We skip the target node by adjusting 'head.next = head.next.next'.
 -We maintain a 'HEAD' pointer to return the original list head after modification.

 Time Complexity:- O(n)
 -We traverse the lsit once -> O(n), where n = number of nodes.

 Space Complexity: O(1)
 -We use only a constant number of extra pointers (no recursion or additional data structures).
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode HEAD = head; //Store the original head so we can return it at the end
        ListNode temp = head; // 'temp' will move n steps ahead of 'head'

        //Step 1: Move 'temp pointer 'n' steps ahead
        while (n>0 && temp.next != null){
            temp = temp.next;
            n--; //decrement n at each step
        }

        //Step 2: If 'n == 1', it means we need to remove the first node(head)
        if(n==1) return HEAD.next;

        //Step 3: If n>1, it means n was greater than the list length which shouldn't happen as per problem statement, but handled here
        if (n>1) return null;

        //Step 4:   Move both 'temp' and 'head' together until 'temp' reaches the end
        while (temp.next != null){
            temp = temp.next;
            head = head.next;
        }

        //Step 5: Remove thetarget node by skipping it
        //'head' is now just before the node to be deleted
        head.next = head.next.next;

        //Step 6: Return the updated head of the list
        return HEAD;
    }
}