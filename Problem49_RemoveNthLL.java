/************** Time Complexity: O(n) ***************/
/************** Space Complexity: O(n) **************/

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
        
        //creating list
        ListNode list = new ListNode(0);
        
        list.next = head;
        ListNode temp = list;
        int length = 0;
        
        //while temp is not null, calculate length of the list
        while(temp.next!=null){
            temp = temp.next;
            length++;
        }
        
        //generate new length by subtracting n
        ListNode nthNode = list;
        int newLength = length - n;            
        while(newLength>0){                          
            nthNode = nthNode.next;                     
            newLength--;                             // length-- to reach nth node from the end
        }
        
        //delete nthNode.next
        if(nthNode.next == null){
            nthNode.next = null;            
        }
        else{
            nthNode.next = nthNode.next.next;        
        }
        
        //return remaining elements of the list
        return list.next;
    }
}