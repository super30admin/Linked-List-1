// Time Complexity : O(n) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //trick is to create an appropriate gap between fast & slow pointer
        //so that when fast is at null(end), slow will be at 'n' gap from end
        
        ListNode dummy = new ListNode(-1); //creating dummy for first node
        
        dummy.next = head; //through head dummy is connected towards the start of linkedlist
        
        ListNode slow = dummy; ListNode fast = dummy; //intializing
        int count = 0; //measuting the gap
         
        while(count <= n) { //until gap reaches the value given
            fast = fast.next; //moving just the fast
            count++; //keeping track of the count for gap
        }
        
        while(fast != null) { //till the fast reaches the end
            slow = slow.next; //moving slow to next
            fast = fast.next; //fast is moved AGAIN because, FAST
        }
        
        slow.next = slow.next.next;//deleting (skipping the found element)
        
        return dummy.next;//original list starts from head, dummy was added at the beginning.
        //so dummy.next becomes the actual head of list
    }
}