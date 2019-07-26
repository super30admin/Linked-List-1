// Time complexity: o(n)
// approach: have two nodes pointing at head. 
// Iterate 1st pointer till n, then start itertating the pointer at n and iterating the pointer at head until it reaches the last node.
// remove the node by pointing second pointer (slow pointer) to the next's next pointer

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = head;
        ListNode node2 = head;
        while( n>0 && node1.next!=null ) {
            node1 = node1.next;
            n--;
        }
        
        if(n!=0) return head.next;
        while( node1.next!=null ) {
            node1 = node1.next;
            node2 = node2.next;
        }
        node2.next = node2.next.next;
        return head;
    }
}