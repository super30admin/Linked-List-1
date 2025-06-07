/*
  Time complexity: O(n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        int count = 0;
        ListNode curr = head;

        while(curr!=null)
        {
            curr = curr.next;
            count++;
        }

        int k = count-n;
        curr = dummy;
        while(k>0)
        {
            curr = curr.next;
            k--;
        }

        curr.next = curr.next.next;
        return dummy.next;
    }
}
