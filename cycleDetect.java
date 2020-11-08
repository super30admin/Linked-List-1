//Time complexity: O(n)
//Space complexity: O(1)
//Program ran successfully
/*
    Algorithm: 1. Floyd's cycle detection algorithm
               2. One slow and one fast pointer traverse the list and if they intersect at certain point, cycle is present
               3. To find the head, we reset one of the pointers and then move both pointers by same speed. the point at which they intersect is the start of the cycle
*/
public class cycleDetect {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag){
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
