/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {

    // Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I am using 2 pointer slow and fast and 2 loops. In 1st loop,
    //I am moving my fast pointer at 2x speed and slow pointer at x speed. I try to traverse the list. If there is a cycle,
    //then there will be a point that slow and fast pointer will meet. If not then the fast pointer will reach last node and
    //exit the loop. If they meet, then I am setting my slow pointer to beginning, and then taking fast and slow pointer both
    //at 1x speed until they meet. Then I am returning the node when they meet as that is the beginning of the cycle.

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(flag == false){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}