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

The idea is to find the particular element from start and then change pointer of previous and next.


**/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        int length =  0;
        
        //Boundary Condition
        if(head == null)
            return null;
        
        //Length of the List
        while(temp != null){
            length += 1;  
            temp = temp.next;
        }
        
        //Initializing
        temp = head;
        ListNode prev = null;
        
        //Iterating till we reach the particular node
        while(temp != null){
            if(count == length - n){
                if(prev != null)
                    prev.next = temp.next;
                else{
                    return temp.next;
                }    
                temp = temp.next;    
            }else{
                prev =  temp;
                temp = temp.next;
            }
            count += 1;
        }
       return head; 
    }
}
