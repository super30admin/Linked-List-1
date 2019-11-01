// Time Complexity :O(n)
// Space Complexity :constant
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
    public ListNode reverseList(ListNode head) {
    	//taking two variables curr and temp and assigning values head and null respectively
    ListNode curr=head;ListNode temp=null;
    //if linked list has one node or null node return head
    if(head==null || head.next==null) return head;
    //iterate till end of the list
        while(curr.next!=null)
        {
        	//the node we want to place before the head is stored in temp
            temp=curr.next;
            //assigning the temp's pointer to head's pointer
            curr.next=temp.next;
            //pointer of temp now points to head
            temp.next=head;
            //making temp the head
            head=temp;
        }
        //returning head;
        return head;
    }
}