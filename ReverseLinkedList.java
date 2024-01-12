/*
* Approach:
*  1. Maintain two pointers prev and curr
* 
*  2. Move these pointers until curr touches null by modifying the links.
        temp = curr.next;        
        curr.next = prev;
        prev = curr;
        curr = temp;
* 
*  3. Once curr reaches null,
        return prev pointer as reversed head.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;

        while (curr != null) {
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
