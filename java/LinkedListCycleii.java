// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Used 2 pointers to detect the cycle and then traversed from head until the cycle's intersect to get the node where the cycle starts and return it
 */
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



        ListNode intersect = getIntersect(head);
        if(intersect==null) return null;
        ListNode p1 = head;
        ListNode p2 = intersect;
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    private ListNode getIntersect(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode pos = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return fast;
            }
        }
        return null;
    }
}