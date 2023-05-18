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

//  Time:O(n)
//  Space: O(1)
class Solution {
    ListNode prev = null;
    ListNode headReturn;
    public ListNode reverseList(ListNode head) {
        // Iterative
        // ListNode prev = null;
        // ListNode next;
        // while(head != null){
        //     next = head.next;
        //     head.next = prev;
        //     prev = head;
        //     head = next;
        // }
        // return prev;
        
        // Recursion
        if(head == null || head.next == null){
            return head;
        } 


        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        
        return newHead;



    }

    // public ListNode reverse(ListNode node,  ListNode prev){
    //     if(node == null){
    //         return prev;;
    //     }

    //     // condition
    //     ListNode next = node.next;
    //     node.next = prev;
    //     return reverse(next, prev);
        
    // }




}