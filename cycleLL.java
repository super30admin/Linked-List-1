/// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
//Traverse the list using fast and slow pointers untill sptr and fptr are same. if same break there.
//keep the fptr there only and start sptr from head.move both the pointers one step untill both are same.
//return the sptr if both are same.else return null after the loop.



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
        if(head == null) return null;
        ListNode sptr=head,fptr=head;
        while(fptr!=null && fptr.next!=null){
            fptr=fptr.next.next;
            sptr=sptr.next;
            if(sptr==fptr){
                break;
            }
        }
        sptr=head;
        while(fptr!=null && fptr.next!=null){
            if(sptr==fptr){
                return sptr;
            }
            fptr=fptr.next;
            sptr=sptr.next;
            
        }
        return null;
        
       
        
    }
}