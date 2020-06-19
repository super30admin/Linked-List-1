// Time Complexity : O(n)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

//-------Iterative Solution-----------------
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        curr.next = prev;
        return curr;
    }
}

//-------Recursive Solution-----------------

// Time Complexity : O(n)
//Space Complexity : O(n) 
//Did this code successfully run on Leetcode : Yes
class Solution {
    public ListNode reverseList(ListNode head) {
        
        //. base
        if(head == null || head.next == null) return head;
        
        // Logic
        
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return r;
}
}