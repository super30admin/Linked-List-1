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


// O(n) time  || O(N)- space
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prevNode = null;
        ListNode current = head;
        
        while(current!=null){
            
            ListNode nextNode = current.next;
            current.next= prevNode;
            prevNode= current;
            current= nextNode;
        }
        
        return prevNode;
    }
}
