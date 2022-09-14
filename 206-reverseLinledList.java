//Approach-1: Using the pointers
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode prev = null;
        //To avoid the loss of the head.next link
        ListNode next = head.next;
        
        while(next != null){
            head.next = prev;
            prev = head;
            head = next;
            next = next.next;
        }
        //We need to tackle this case at the end after the loop
        head.next = prev;
        
        return head;
        
    }
}


//Approach-2: Using Recursion
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(N)
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return reverse;
    }
}