// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
import java.util.*;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
       public ListNode reverseList(ListNode node) {
           if (node == null) {
               return null;
           }
           
           if (node.next == null) {
               return node;
           }
           
           ListNode head = reverseList(node.next);
           node.next.next = node;
           node.next = null;
           
           return head;
       }
}