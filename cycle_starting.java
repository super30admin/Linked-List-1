// Time Complexity : O(n)
// Space Complexity : O(1)


class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null)
            return null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null)
            return null;
        if(slow==fast){
            ListNode temp = head;
            while(temp!=fast){
                temp=temp.next;
                fast=fast.next;
            }
            return temp;
        }
        return null;
    }
}
