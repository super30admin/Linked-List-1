// Time Complexity : O(n), where n is the number of nodes in the linkedlist
// Space Complexity : O(n), where n is the number of nodes in the linkedlist, space required for stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three liner explanation of your code in plain english
//1. Create a stack and push n-1 node in the stack making the nth element as the current.
//2. Keep poping the stack till it becomes empty, amd at every step make the reversed connection of the nodes
//3. In the end add null the stack's last node's  next because originally it had its own connection, and return the current that 
        //holds the linkedlist
        
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
        
        Stack<ListNode> stack = new Stack<>();
        
        //push n-1 elements in the stack
        while(head.next != null){
            stack.push(head);
            head = head.next;
        }
        //assign current head as the current node
        ListNode current = head;
        //and current as the head
        head = current;
        
        //pop the elements from stack while assigning them as head.next
        while(!stack.isEmpty()){
            head.next = stack.pop();
            head = head.next;
        }
        
        //assign the null as the last node' next, as last node originally had a next pointer
        head.next = null;
        //cuurent holds the linkedlist
        return current;
    }
}