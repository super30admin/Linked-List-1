/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
Leet Code Submitted : YES
Time Complexity : O(N)
Space Complexity : O(1)

Use 2 pointers next and temp to swap the pointers so it reverse the list withput using extra space and extra time**/

class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return null;
        
        
        ListNode temp = null;
        ListNode prev =  null;
        
        while(head != null){
            temp      = head.next;
            head.next = prev;
            prev      = head;
            head      = temp;
        }
        
        return prev;
        
    }
}
