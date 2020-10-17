/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//solution with 2 passes

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;
        
        ListNode curr= head;
        
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        
        int k = len-n+1; //when LinkedList has only 1 node 
        if(k==1){
            return head.next;
        }
        curr=head;
        
        int i=0;
        while(curr!=null){
            i++;
            if(i==(len-n)){
                curr.next = curr.next.next;
            }
            
            curr = curr.next;
        }
        
        return head;
        
    }
}
