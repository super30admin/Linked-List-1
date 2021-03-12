// TC - O(n), SC - O(1)

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
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         int size = 0;
//         ListNode temp = head;
//         while(temp != null){
//             size++;
//             temp = temp.next;
//         }
//         size = size - n;
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         temp = dummy;
//         while(size > 0){
//             size--;
//             temp = temp.next;
//         }
        
//         temp.next = temp.next.next;
//         return dummy.next;
//     }
// }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a ListNode dummy with -1 
        ListNode dummy = new ListNode(-1);
        // point dummy next to head
        dummy.next = head;
        // Create 2 listnodes p1 and p2 pointing to dummy
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        // keep at a distance of n between p1 and p2
        while(n>0){
            p2 = p2.next;
            n--;
        }
        // iterate till p2.next not equal to null, go to next node
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        // skip the next listnode by pointing p1.next to p1.next.next
        p1.next = p1.next.next;
        // return dummy.next;
        return dummy.next;
    }
}