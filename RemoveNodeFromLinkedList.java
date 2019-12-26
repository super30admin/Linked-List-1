//Time Complexity : O(n)
//Space complexity: O(1)
//Solved on leetcode successfully: Yes
//Approach: Two pointer solution. 
// Set a dummy node
// Set slow and fast to the dummy node
// Move fast pointer uptil the nth element (That is by 2 positions, if the element to be removed is 2nd from the end.)
// Again iterate over the list using slow and fast. This time moving them at same pace. When fast is null, assign the 
// slow node to the one node after the next

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveNodeFromLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;
        
        int count =0;
        
        while (count <=n) {
            fast = fast.next;
            count ++;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
    
}