//19. Remove Nth Node From End of List
//Time Complexity: O(n);
//Space Complexity: O(1);
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count = 1;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        int targetIndex =  count - n;
        count = 1;
        ListNode prev = null;
        temp = head;
        while(count < targetIndex){
            
            prev = temp;
            temp = temp.next;
            count++;
        }
        //delete the node
        if(prev == null){
            //have to delete first node
            head = head.next;
        } else{
            //not first node
            if(prev != null && temp != null)
            prev.next = temp.next;
        }
        return head;
        //reach n th node
    }
}