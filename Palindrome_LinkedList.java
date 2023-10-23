//234. Palindrome Linked List

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
    public boolean isPalindrome(ListNode head) {
    
    if(head == null)
    return false;
    if(head.next == null) 
    return true;
        
    //split 
    ListNode slow = head;
    ListNode fast = head;
     
    
    if(fast.next.next == null) {
        if(slow.val != fast.next.val)
        return false;
        else return true;
    }
        
    while(fast.next!=null && fast.next.next !=null){
        slow= slow.next;
        fast= fast.next.next;
    }
 
    fast = reverse(slow.next);
    slow.next= null;
    slow = head;
    
        
    while(fast!= null) {
        if(slow.val != fast.val)
            return false;
        slow= slow.next;
        fast= fast.next;
    }   
    return true;

    }
  
    

    private ListNode reverse(ListNode head){
        ListNode temp,prev=null;
        ListNode curr=head;
        while(curr!=null){
            
            temp= curr.next;
            curr.next = prev;
            prev = curr;
            curr= temp;
        }
        return prev;
    }
    
}
