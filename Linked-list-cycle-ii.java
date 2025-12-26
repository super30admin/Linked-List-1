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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag=false; //whether its a cycle
        ListNode slow = head;
        ListNode fast = head;
        //even || odd
        while(fast!=null && fast.next!=null){
            //move slow by 1 & fast by 2
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true; //it is a cycle
                break;
            }

        }
        if(!flag) return null; //-1
        //if cycle exists acc to Floyd's tortoise & Hare algorithm distance from starting point of LL to starting point of cycle (a)== distance from meeting point to start of cycle(c)
        slow = head;
        while(slow!=fast) {
            //move one each
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}