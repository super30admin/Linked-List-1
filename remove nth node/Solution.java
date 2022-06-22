//Time Complexity: O(n)
//Space Complexity:O(1)
class Solution {
    // COMMENTS
    // Keep 2 ptrs fast and slow.
    // keep fast ptr n steps ahead of slow.
    //     Iterate both ptrs until fast.next=null
    //     when fast.next==null then do slow.next=slow.next.next
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n==0) return null;
        ListNode ptr = new ListNode();
        ptr.next=head;
        ListNode f=ptr;
        ListNode s=ptr;
        while(n>0){
            f=f.next;
            n--;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return ptr.next;
    }
}
