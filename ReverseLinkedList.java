/*
Thought Process: Take 3 Pointers Approach -> prev, curr and next
Initialize prev to null, curr to head and next to curr.next
Loop till next is not null, 
    1. Curr.next will be prev (pointing behind)
    2. prev will be curr
    3. Curr will be next
    4. Next will be curr.next
    
Finally connect curr's next to prev one last time and return curr

Mistakes Committed -> Too much confusion in this problem. Need to practice a lot

TC -> O(N)
SC -> O(1)

*/


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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null, curr = head, next = head.next;
        while(next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        return curr;
    }
}