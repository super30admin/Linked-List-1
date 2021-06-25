
//Time Complexity: O(N)
//Space Complexity: O(1)



class Solution {
    public ListNode reverseList(ListNode head) {
       // return helper(head, null);
        
        ListNode prev = null;
        
        while(head != null){
            ListNode curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        
        return prev;
        
    }
    
    private ListNode helper(ListNode head, ListNode prev){
        if(head == null)
            return prev;
      ListNode nextNode = head.next;
        head.next = prev;
        prev = head; // prev  = 1  //head 2
        head = nextNode;
        return helper(head, prev);
    }
}
