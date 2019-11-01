// Time Complexity :
// Space Complexity :O(n^2)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) 
    { 	//if there is one node or no value in node return it without doing anything
        if(head==null || head.next==null ) return head;
        //else call the function to reverse the linked list using recursion
        return RecursiveFun(head,head);
        
    }
    public ListNode RecursiveFun(ListNode head,ListNode curr)
    {
    	//if current node is pointing to null, return head
        if(curr.next==null) return head;
        //a variable to store value of node is declared and initiated to null
        ListNode temp=null;
        //storing value of next node in temp
        temp=curr.next;
        //assigning the temp's pointer to head's pointer
        curr.next=temp.next;
        //pointer of temp now points to head
        temp.next=head;
         //making temp the head
        head=temp;
        //calling the function again to reverse the complete linked list
        return RecursiveFun(head,curr);
    }
}