class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode d = new ListNode(-1);
        d.next = head;
        ListNode r = d;
        while(n>0){
           r = r.next;
            --n;
        }
        ListNode l = d;
        while(r.next!=null){
        l =l.next;
        r = r.next;
        
        }
        l.next = l.next.next;
        return d.next;
    }
}
//tc=O(n)
//sc=O(n)
