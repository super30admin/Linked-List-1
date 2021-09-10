/*

time : O(n)
Space : O(n)

N = number of elements in linkedList


 */


class Solution {
    public ListNode reverseList(ListNode head) {
        
    if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    //System.out.println(head.val);    // recursive stack
    //System.out.println(p);  
    head.next.next = head;
    head.next = null;
    return p;
        
    }
}