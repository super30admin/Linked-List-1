/*
Recursive solution
Time complexity- O(n)
space complexity- O(n)- recursion stack space
*/
class Solution {
    ListNode newHead;
    public ListNode reverseList(ListNode head) {
        //edge case
        if(head == null)
            return null;
        newHead = null;
        reverseListUtil(head);
        return newHead;
    }
    private void reverseListUtil(ListNode cur){
        if(cur.next == null){
            newHead = cur;
            return;
        }
        reverseListUtil(cur.next);
        cur.next.next = cur;
        cur.next =null;
    }
}
/*
Iterative solution
Time complexity- O(n)
space complexity- O(1) 
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        //edge case
        if(head == null)
            return null;
        
        ListNode next =null, prev = null, cur = head;
        while(cur != null){
            next = cur.next;
            cur.next= prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
