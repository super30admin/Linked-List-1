// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Not really

public class solution1 {
    public ListNode reverseList(ListNode head) {        
        if(head == null || head.next == null) {
            return head;
        }

        ListNode previous = head;
        ListNode auxillary = head.next;

        while(auxillary != null) {
            ListNode temp = auxillary.next;
            previous.next = temp;
            auxillary.next = head;
            head = auxillary;

            auxillary = temp;
        }

        return head;
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}