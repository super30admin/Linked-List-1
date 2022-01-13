// Time Complexity : O(n) where n is length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class RemoveNthNode {
    public static void main(String[] args) {
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        //this is done to have a gap of n nodes between slow and fast pointer
        while(count < n){
            fast = fast.next;
            count++;
        }
        //move fast till last node so that slow will point to the node prev to node to be removed
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        //slow will be pointing to the prev of list node to be removed
        slow.next = slow.next.next;
        
        return dummy.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
