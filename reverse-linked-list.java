/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Iterative Solution with time complexity O(N) and space complexity O(1)
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         //Edge case
//         if(head == null || head.next == null)
//             return head;
        
//         ListNode reverse=null, cursor=head, next;
//         while(cursor != null)
//         {
//             next=cursor.next;
//             cursor.next = reverse;
//             reverse=cursor;
//             cursor=next;
//         }
//         return reverse;
//     }
// }

//Recusrive Solution with time complexity O(N) and space complexity O(N)
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode R=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return R;
     }
 }