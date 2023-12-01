// Time Complexity: O(n)
// Space Complexity: O(1) 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head, p=temp.next;
        ListNode q = p.next;
        temp.next = null;
        while(q != null){
            p.next = temp;
            temp = p;
            p = q;
            q = q.next;
        }
        p.next = temp;
        head = p;
        return head;
    }
}