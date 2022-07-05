// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

class Solution {
    ListNode reversed;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode result = helper(head);
        head.next = null;
        return result;
    }
    private ListNode helper(ListNode head){
        if(head == null || head.next == null) return head;
        reversed = reverseList(head.next);
        head.next.next = head;
        return reversed;
    }
}

/*

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reversed = reverseList(head.next);
        //System.out.println(head.val);
        //System.out.println(reversed.val);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
*/
/*
//Iterative solution
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
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
*/