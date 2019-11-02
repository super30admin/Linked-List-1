/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/* 19. Remove Nth Node From End of List -> Two pass algorithm
add an auxiliary "dummy" node, which points to the list head. 
The "dummy" node is used to simplify corner cases such as a list with only one node, or removing the head of the list
Time Complexity: O(n)
Space Complexity: O(1)

dummy node to handle the edge case [1] and n = 1
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int len = 0;
        ListNode temp = head;

        while(temp != null){
            len++;
            temp = temp.next;
        }

        len = len - n; //remove len' th node from beginning so
        temp = dummy;

        while(len > 0){
            len --;
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return dummy.next;
    }
}


/*19. Remove Nth Node From End of List, One pass solution
Time Complexity: O(n)
Space Complexity: O(1) */
// We need dummy node here to maintain the edge case to remove the head of the list
// and there is only one node in the list

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        //maintain a difference of (length - n) between the two pointers
        while(count <= n){
            fast = fast.next;
            count++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}


/*19. Remove Nth Node From End of List, One pass solution
Time Complexity: O(n)
Space Complexity: O(1) */
// We need dummy node here to maintain the edge case to remove the head of the list
// and there is only one node in the list

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        //maintain a difference of 'n' between the two pointers, change here
        while(count < n){
            fast = fast.next;
            count++;
        }

        //changed here
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}