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
/**
Leet Code Submitted : YES
Space Complexity : O(1)
Time Complexity : O(N) 

The idea is to first detect cycle in a list using slow and fast pointer method.If there is a cycle then initialize slow pointer to head and increase both fast and slow till they intersect. The intersection point will be the cycle.
**/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int flag = 0;
        
        if(head == null)
            return null;
        
        while(fast != null   && fast.next != null){
            if(fast.equals(slow) && flag == 1){
                return findNode(fast,head);
            }
            slow = slow.next;
            fast = fast.next.next;
            
            flag = 1;
            
           
        }
        return null;
    }
    
    private ListNode findNode(ListNode fast,ListNode head){
        ListNode temp = head;
        while(true){
            if(fast == temp)
                break;
            fast = fast.next;
            temp = temp.next;
        }
        return fast;
    }
}
