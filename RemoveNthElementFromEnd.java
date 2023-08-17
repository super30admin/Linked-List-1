// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
// TC : O(n)
// SC : O(1)
// Did this code successfully run on Leetcode : yes


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


package S30_Codes.Linked_List_1;

public class RemoveNthElementFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int count = 0;

        while(count < n){
            ptr2 = ptr2.next;
            count++;
        }

        if(ptr2 == null)
            return head.next;

        while(ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        ptr1.next = ptr1.next.next;

        return head;
    }
}
