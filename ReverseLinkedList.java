// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode temp1=head;
        ListNode temp2=head;
        while(temp1.next!=null){
            temp2=temp1.next;
            temp1.next=temp2.next;
            temp2.next=head;
            head=temp2;   
        }
        return head;
    }
}
