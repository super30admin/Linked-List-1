/* 

Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : NA

*/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if (head == null){
            return null;
        }

        boolean hasCycle = false;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle)
            return null;
        p2 = head;

        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}