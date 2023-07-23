// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //creating a dummy head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        //Creating two pinters slow and fast which start from dummy head and pointing actual head to dummy head as well
        ListNode slow = dummy;
        ListNode fast = dummy;
        head = dummy;

//Fast pointer would go that many steps ahead as n. Using count to do that
        int count = 0;
        while(count != n){
            fast = fast.next;
            count++;
        }
//Iterate fast and slow pointer till fast reached the last node
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
//Removing the node next to slow pointer
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
//Pointing head again to the original head and returning head
        head = head.next;

        return head;
    }
}