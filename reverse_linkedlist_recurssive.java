// Time Complexity : O(n), where n is the number of nodes in the linkedlist
// Space Complexity :O(n), where n is the number of nodes in the linkedlist (space for recursive stack)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three liner explanation in plain english 
//1. while head is not null OR head.next is not null keep recursively calling the reverseList function with head.next
//2. once base condition hits, the recursive stack will start unfolding, so keep making the reverse connection with nodes
//3. Return the reference of that holds the reversed head of the linkedlist

// Your code here along with comments explaining your approach
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
        //return head if head is null or head is a single listnode
        if(head == null || head.next == null) return head;
        
        //recursive calls till node = n-1 goes in the recursive stack
        //current is pointing to the last (nth) node
        ListNode current = reverseList(head.next);
        //stack.pop() happens here, making node as n-1 th node
        //making the new reversed connections
        head.next.next = head;
        head.next = null;
        
        //cuurent holds the linkedlist
        return current;
    }
}