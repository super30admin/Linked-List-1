// Time Complexity : The time complexity for this iterative approach is O(n).
// Space Complexity : The space complecity can be considered to be constant
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : N/A

class ReverseList {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp = head.next;
        while(temp!=null){
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;
        return curr;
    }
}