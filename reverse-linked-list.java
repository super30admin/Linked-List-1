// Time Complexity :O(n)
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach:this is basic itterative solution 
// first i have taken null node as prev and head as current by pointing current.next node to prev node and before this i put current.next in temp because i am loosing connection while pointing to prev
// then i assign prev to current as well as current to temp  


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
        ListNode prev=null;
        // prev.next=head;
       ListNode current = head;
        while(current != null){
        ListNode temp = current.next;
        current.next=prev;
        prev=current;
        current=temp;
        }
         return prev;
    }
}


// Time Complexity :O(n)
// Space Complexity :O(1) -O(n) stack space
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach:here i have used recursive stack to implement this instead of two pointers and after reaching null head retuurning the head and removing the connection to the previos head.
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
    ListNode result;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

       result=reverseList(head.next);
       head.next.next=head;
       head.next=null;
       return result;
    }
} 