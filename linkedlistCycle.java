// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

//to detect cycle, we'll move our fast pointer with 2x speed and slow pointer with x speed. If both met, means there is a cycle
//then, we'll reset our slow pointer to head and then move both slow and fast pointer with x speed the'll meet at the
//point where cycle starts 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean containsCycle = false;
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                containsCycle = true;
                break;
            }
        }
        if (containsCycle) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } else {
            return null;
        }
    }
}