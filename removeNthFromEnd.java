/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1 || head==null) return null;
        ListNode curhead = new ListNode(0), ncur = curhead, cur = curhead; curhead.next = head;
        while(cur.next!=null) {
            cur = cur.next;
            if(n<=0) ncur = ncur.next;
            // System.out.println(n + " " + cur.val + " " + ncur.val);
            n--;
        }
        if(ncur.next!=null) ncur.next = ncur.next.next;
        return curhead.next;
    }
}