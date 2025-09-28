/**
TC: O(n) n: no of nodes in the list.
SC: O(1) no extra space used.
Approach: using slow and fast pointer, slow moves one step, fast move two steps, as soon as they both meet i reset slow to head and again keep moving both the pointer but now just by 1 step. the node they meet is the starting point of the cycle. Also to check if theres no cycle, i will check if fast or fast.next is null aster first loop then its confirmed that theres no cycle and i will return null.
 */

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
public class linkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
            if(fast == null)
                return null;
        } 

        if(fast == null || fast.next == null)
            return null;  

        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
        
    }
}