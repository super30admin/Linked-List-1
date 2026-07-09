// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : old linked list node was not set to null after popping from stack, which caused a cycle in the linked list

// Your code here along with comments explaining your approach: push all the nodes of the linked list into a stack, then pop them one by one and create a new linked list in reverse order. Set the next pointer of the last node to null to avoid cycles.
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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        Stack<ListNode> st = new Stack<>();

        while(curr != null){
            st.push(curr);
            curr = curr.next;
        }
        ListNode reverseHead = new ListNode(-1);
        curr = reverseHead;
        while(!st.isEmpty()){
            curr.next = st.pop();
            curr = curr.next;
            curr.next = null;
        }

        return reverseHead.next;
    }
}
 {
    
}
