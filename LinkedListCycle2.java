// Time Complexity : O(n) — at most 2 passes 
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes

// approach:
// 1) Use two pointers (hare=2x speed, turtle=1x) to detect cycle.
// 2) If they meet, reset head pointer to start.
// 3) Move head and turtle one step each; their meeting point = cycle entry.


public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next;
            turtle = turtle.next;

            if(hare == turtle){
                while(head != turtle){
                    head = head.next;
                    turtle = turtle.next;
                }
                return turtle;
            }
        }
        return null;
    }
}
