// Time Complexity : O(n) where  n is no.of nodes in the LinkedList
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/*Approach
 * Approach is to use the fast and slow ie 2 pointers. Fast moving 2time the speed of the slow.
 * During the iteration, slow and fast pointers will intersect in case there is the cycle present.
 * If there is intersection present we reset the slow pointer to head and iterarte until we come  find node where
 * slow== fast , ie node where cycle starts
 * */


public class LinkedListCycleII {

    public ListNode detectCycle(ListNode head) {
        //edge
        if(head==null) return head;

        ListNode slow  = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                flag = true;
                break;
            }
        }

        //no cycle since both pointers did not  intersect
        if(flag==false) return null;

        //else cycle is present
        //since a==c
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
