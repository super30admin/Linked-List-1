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
    /*
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public ListNode reverseList(ListNode head) {
        // node that will point to head
        ListNode dummy = new ListNode(-1, head);
        
        // initially the prev will be pointing to null
        ListNode prev = null;
        // and curr will start from the head of the list
        ListNode curr = head;
        
        // keep traversing the list until the last element is reached
        while(curr != null){
            
            // assign the next node the current.next node
            ListNode next = curr.next;
            // curr.next node will now point to the prev node
            // as we have to reverse the list
            curr.next = prev;
            // then prev will point to the current node
            // this will help in reversing the next node
            prev = curr;
            // now to traverse through the list
            // move the current to the next node
            curr = next;
        }
        // will return prev
        // it will contain the head value of the newly reversed list
        return prev;
    }
}