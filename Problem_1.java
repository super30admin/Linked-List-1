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
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// Set 3 pointers, and set the value f second.next to first and increase the window
// at the end assign the last element to the list

// Your code here along with comments explaining your approach
// reverse the list using normal method
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         // check for empty list
//         if( head == null ) return null;
//         ListNode n1 = null;
//         ListNode n2 = head;
//         ListNode n3 = head.next;
//         while( n3 != null){
//             n2.next = n1; // assign the pointer backwards
//             n1 = n2;
//             n2 = n3;
//             n3 = n3.next;
//         }
//         n2.next = n1; // assign the last element
//         return n2;
//     }
// }

// reversing the string using recuresion -- asked in "Google"
class Solution {
    public ListNode reverseList(ListNode head) {
        if( head == null || head.next == null ) return head;
        ListNode reverse = reverseList( head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}