class Solution {
    public ListNode reverseList(ListNode head) {
         if(head==null || head.next == null)
        return head;
 
    //get second node    
    ListNode second = head.next;
    //set first's next to be null
    head.next = null;
 
    ListNode rest = reverseList(second);
    second.next = head;
 
    return rest;
        
    }
}