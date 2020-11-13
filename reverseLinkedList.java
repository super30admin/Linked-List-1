// Time Complexity : o(1)
// Space Complexity : o(n) height of the tree
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 206
//Approach : Stack iterative


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
        if(head == null || head.next == null) return head;
        Stack<ListNode> st = new Stack<>();

        while(head.next != null){
            st.push(head);
            head = head.next;
        }
        ListNode reversed = head; 
        while(!st.isEmpty()){
            head = st.pop();
            head.next.next = head;
            head.next = null;
        }
        return reversed;
    }
}

// Time Complexity : o(1)
// Space Complexity : o(n) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 206
//Approach : recursive

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode reversed = reverseList(head.next) ;
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}

// Time Complexity : o(1)
// Space Complexity : o(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 206
//Approach : Iterative


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;     
        }
        return prev;
    }
}


