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
        ListNode dummyNode = new ListNode(){
            val = -1,
            next = head,
        };
        ListNode slowPtr = dummyNode;
        ListNode fastPtr = dummyNode;
        int count = 0;
        while(count <= n)
        {
            fastPtr = fastPtr.next;
            count++;
        }
        while(fastPtr != null)
        {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        slowPtr.next =  slowPtr.next.next;

        return dummyNode.next;
        
    }
}