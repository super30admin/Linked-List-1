// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Provide the X is the length from head to the start point of circle and Y is the length of the circle. We know slow moves t, while fast moves 2t. They meet at K where is the length from the start point of the circle.
// Then we have :
// t = X + nY + K
// 2t = X + mY + K
// then we get,
// X+K  =  (m-2n)Y 
// X = (Y - K) + (m - 2n - 1)Y
// which means by finishing the rest length of the circle and some number of circle lengths, the traveled distance is equal to X.


public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) { // cycle detected
                while(temp!=fast) {
                    temp=temp.next;
                    fast=fast.next;
                }
                return temp;
            }
        }
        return null; // no cycle
    }
}