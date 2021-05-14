/*
Desc: We run over the list using two pointers where one runs at 1x and other at 2x speed, the moment they both meet, one of the pointer is set
to the start again and both pointers are incremented to consecutive nodes till they are at the same point. This node would be the beginning of the cycle.
Time Complexity: O(n)
Space Complexity: O(1)
*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
