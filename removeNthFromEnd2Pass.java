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

 // Time Complexity: O(n) as we are traversing the list 2 times
 // Space Complexity: O(1) as only reference List Nodes are used
 // Did you complete it on leetcode: Yes
 // Any problems faced: didn't consider initially case when previous is null

 // Write your approach here:
 // Idea here is to iterate through the list once with a fast pointer and slow pointer
 // to identify the node to be removed by running slow pointer n steps behind fast pointer
 // as soon as fast pointer hits null we get slow pointer index
 // Now iterating again we use a previous node along with head
 // to maintain the next pointers. We only need to check if current index is same as target index
 // if yes we update previous's next to head.next and increment i (if prev is not null)
 // else we can just return the 2nd in list (head.next)
 // while we have not hit target keep updating previous to current head and head to next pointer location
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        int targetIdx = -1;
        ListNode firstHead = head;
        while(head!=null) {
            head = head.next;
            count++;
            if(count>=n) {
                targetIdx++;
            }
        }
        if(count<n) {
            return new ListNode();
        }
        head = firstHead;
        int i = 0;
        ListNode prev = null;
        while(head!=null) {
            if(i!=targetIdx) {
                prev = head;
                head = head.next;
                i++;
            } else {
                if(prev!=null) {
                    prev.next = head.next;
                    i++;
                } else {
                    return head.next;
                }
            }
        }
        return firstHead;
    }
}