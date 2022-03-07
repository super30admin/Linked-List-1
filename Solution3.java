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
/*
    Time Complexity : O(n)
    Space Complexity : O(n)
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode slowPtr = head.next;
        ListNode fastPtr = head.next.next;
        
        while(fastPtr != slowPtr){
            if(fastPtr == null || fastPtr.next == null){
                return null;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        ListNode temp = head;
        ListNode curr = slowPtr;
        
        while(temp != curr){
            temp = temp.next;
            curr = curr.next;
        }
        
        return curr;
    }
}
