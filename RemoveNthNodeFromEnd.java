//The approach here is to maintain a gap of n between slow and fast pointers. So we iterate first one of the pointer till that gap is achieved and then traverse till the end.
//The slow pointer is now at a node whose next node is the one to be removed
//To handle the case of removal of head, we take a dummy node as the first node and do the same steps
//Time Complexity: O(n)
//Space Complexity: O(1)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<n){
           fast = fast.next;
           count++;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp = null;
        return dummy.next;
    }
}
