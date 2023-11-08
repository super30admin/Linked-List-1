// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Iterative approach

class Solution1 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode left=head, right= head.next;
        ListNode curr=right;

        while(right!=null){
            right=right.next;
            curr.next=left;
            left=curr;
            curr=right;
        }
        head.next=null;
        head=left;
        return head;
    }
}



// Time Complexity : O(n)
// Space Complexity : O1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Recursive approach

class Solution2 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead= reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}