// https://leetcode.com/problems/linked-list-cycle-ii/description/
// TC : O(n)
// SC : O(1)
// Did this code successfully run on Leetcode : yes


package S30_Codes.Linked_List_1;
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

// Proof //
//                -> 0 ->  0->
//               0           0  <-- m = fast_ptr And slow_ptr metting point
// 0->0->0->0->0-              |
// ---- a -----  0           0
//                 <- 0  <- 0 <-
//              -----  c ----- (cycles)

// slow_ptr = a + xc + m
// fast_ptr = a + yc + m
// f == 2s
// a + yc + m = 2( a + xc + m )
// a + yc + m = 2a + 2xc + 2m
// a + m + 2xc - yc = 0
// a + m + c(2x - y) = 0
// a + c - k + c(2x - y) = 0   // m = c-k
// a - k + c(2x - y +1) = 0
// a + c(2x - y + 1) = k



public class Cycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        ListNode ptr1 = head;
        ListNode ptr2 = slow;

        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}