// Reverse Linked List
// solved on leetcode
// Time complexity -- O(n)
// Space complexity -- O(n)


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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode l= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return l;
        
//         if(head==null){
//             return null;
//         }
//         ListNode prev=null,current=head,forward=head;
        
//         while(forward!=null){
//             forward=forward.next;
//             current.next=prev;
//             prev=current;
//             current=forward;
//         }
        
//         return prev;
        
        
    }
}