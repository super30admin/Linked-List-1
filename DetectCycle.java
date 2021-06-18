//Time Complexity - O(N)
// Space complexity - O(1)


public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        // check if slow meets fast by moving slow pointer 1x speed and fast pointer to 2x speed
        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                flag = true;
                break;
            }

        }

        // if cycle is not detected return null
        if(!flag) return null;

        // else part
        // reset fast pointer to head
        fast = head;

        // move slow pointer & fast pointer at 1x speed for intersection
        while(slow != fast) {

            slow = slow.next;
            fast = fast.next;

        }

        return fast;



    }
}