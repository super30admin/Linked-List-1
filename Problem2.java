// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//start the fast pointer from n+1 and slow pointer from the first position
//iterate fast pointer till the last index while iterating the slow pointer
//the next node at which the slow pointer stops is the node to be removed
//This is a one pass solution. same can be done using two pass solution

class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;


        while (count < n) {
            fast = fast.next;
            count++;
        }


        if (fast == null) {
            head = head.next;
            return head;
        }


        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }


        slow.next = slow.next.next;

        return head;
    }
}