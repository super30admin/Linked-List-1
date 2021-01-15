//Time Complexity: O(N) where N is the number of nodes in the linked list
//Space Complexity: O(1) 

//Successfully runs on leetcode: 0 ms

//Approach: Here we first take a dummy node that points to the head node. We take two pointers slow & fast to keep a track
//of the nth node from end (but we need to search that node from the start) and once we get the slow pointer to the prev node
//of nth node from end, we will update its next pointer and return the head of the list


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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }
        
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
    
        slow.next = slow.next.next;
        return dummy.next;
    }
}