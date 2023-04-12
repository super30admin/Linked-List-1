// Time Complexity:  O(n)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    
    // ******************** Two pointers approach with extra dummy pointer ********************
    
    ListNode dummy;
    ListNode slow;
    ListNode fast;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        dummy = new ListNode(-1);
        dummy.next = head;
        slow = dummy;
        fast = dummy;
        while(n > 0) {
            fast = fast.next;
            n--;
        }
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
    
    
//     // ******************** Two pointers approach ********************
    
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode slow = head;
//         ListNode fast = head;
//         int i=0;
//         while(i<n) {                                // Making fast pointer n nodes ahead of slow pointer
//             if(fast.next == null)                   // if we reach to the end of the list, we need to remove the head
//                 return head.next;
//             else
//                 fast = fast.next;
//             i++;
//         }
//         while(fast.next != null) {                  // we reach to the end of the list with fast pointer and iterating slow pointer as well
//             slow = slow.next;
//             fast = fast.next;
//         }
//         slow.next = slow.next.next;                 // we reach to the node we need to remove
//         return head;

      
// //         // ******************** One pointer approach with counter ********************
// //         ListNode cur = head;
// //         int count = 0;
// //         while(cur!=null)                         // geting the length of the list
// //         {
// //             cur = cur.next;
// //             count++;
// //         }
// //         cur = head;
// //         if(count == 1 && n == 1)                 // if only one node in the list, we remove null
// //             return null;
// //         if(count == n)                           // if first node needs to be removed
// //         {
// //             head = head.next ;
// //             return head;
// //         }
// //         while(count!=n+1)                        // reach to the node right before the node we need to remove
// //         {
// //             cur = cur.next;
// //             count--;
// //         }
// //         if(cur.next.next == null)                // if node we are removing is the last one
// //             cur.next = null;
// //         else                                     // else
// //         {
// //             cur.next = cur.next.next;   
// //         }
// //         return head;
      
//     }
}
