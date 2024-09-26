/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Time Complexity: O(n)
Space Complexity: O(1)    
Did the code run on leetcode? Yes
Approach: Take two pointers, separate them by a distance of n by first sending the fast ptr ahead by n steps. Move fast ptr and slow ptr together till fast is at tail os that slow will be at n-1. Remove the node which is next to the slow ptr.
    

*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;
        ListNode dummy = new ListNode(0);//dummy node to take when just 1 element in list
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
		//send fast ahead by n steps
        while(count<=n){
            fast = fast.next;
            count++;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
		// now slow is at n-1 position.
        slow.next = slow.next.next;

        return dummy.next; // head is the next of dummy

    }
} 