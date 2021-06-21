// Time Complexity: O(n)
// Space Complexity: O(1)
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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode sPtr = head;
        ListNode fPtr = head;
        boolean flag = false;
        
        while(fPtr != null && fPtr.next != null){
            sPtr = sPtr.next;
            fPtr = fPtr.next.next;
            if(sPtr == fPtr){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fPtr = head;
        while(sPtr != fPtr){
            sPtr = sPtr.next;
            fPtr = fPtr.next;
        }
        return sPtr;
    }
}