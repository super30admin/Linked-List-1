// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// start slow and fast from head.
// move slow at speed 1, fast at 2.
// they will meet at some point on the loop.
// Now place slow on head.
// Move slow and fast at speed 1.
// They will meet exactly at the starting poisition.

public class Solution {

    public ListNode detectCycle(ListNode head) {

        ListNode tortoise=head;
        ListNode rabbit= head;

        while(rabbit!=null && rabbit.next!=null){
            tortoise=tortoise.next;
            rabbit=rabbit.next.next;
            if(rabbit==tortoise){
                tortoise=head;
                while(tortoise!=rabbit){
                    tortoise=tortoise.next;
                    rabbit=rabbit.next;
                }
                return tortoise;
            }
        }
        return null;
    }
}