/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced whilite coding this : None

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = null;
        if(prev.next != null){
            curr = prev.next;
        }
        if(curr==null){
            return head;
        }

        ListNode next = null;
        if(curr.next!=null){
            next = curr.next;
        }

        if(next==null){
            curr.next = prev;
            prev.next = null;
            head = curr;
            return head;
        }
        prev.next=null;

        while(next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        //next.next = curr;
        curr.next = prev;
        head = curr;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}