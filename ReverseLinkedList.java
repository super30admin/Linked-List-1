// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class ReverseLinkedList {
    
    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode temp = null;
       while (head != null){
           temp = head.next;
           head.next = prev;
           prev = head;
           head = temp;
       }
       return prev;
    }
}