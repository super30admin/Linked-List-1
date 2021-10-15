// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public ListNode reverseList(ListNode head) {
    if(head == null) return null;
     ListNode curr = head;
     ListNode prev = null;
     
     //We need to reverse the pointers of the last node as well, so we take curr != null and not 
     //curr.next != null
     while(curr != null){
         ListNode next = curr.next;
         curr.next = prev;
         prev = curr;
         curr = next;
     }
     //Change head to prev as the current head is at the tail after reversing the linked list
     head = prev;
     return prev;
 }