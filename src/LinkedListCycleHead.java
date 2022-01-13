// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

public class LinkedListCycleHead {


    /*
    Floyd's algorithm Tortoise and Hare
        Basically two cars with speed x and 2x starting from same point and then go in a loop then
        the distance between the head of loop and the extra distance covered by faster card is same.
     */
        public ReverseLinkedList.ListNode detectCycle(ReverseLinkedList.ListNode head) {
            if(head == null || head.next == null) return null;
            ReverseLinkedList.ListNode slow = head;
            ReverseLinkedList.ListNode fast = head;
            int flag=0;
            while(fast!=null && fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow) {
                    flag=1;
                    break;
                }
            }
            fast = head;
            while(flag==1) {
                if(fast == slow) {
                    return slow;
                }
                fast = fast.next;
                slow=slow.next;
            }
            return null;
        }

}
