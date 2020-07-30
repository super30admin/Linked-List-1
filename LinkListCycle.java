/**
 // Time Complexity : O(n)
 // Space Complexity :O(1)
 // Did this code successfully run on Leetcode :yes
 // Any problem you faced while coding this :
    //Nope

 // Your code here along with comments explaining your approach
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;

        ListNode fast = head;
        ListNode slow = head;

        //find intersections.
        do{
            if(fast == null || fast.next == null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
        }while(fast != slow);

        //from intersection move at same fast(at intersection) nd
        //slow(at head) same speed.
        //will collide at begning of circle.
        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
