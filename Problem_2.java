// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//I calculate the tootal length and then deduct the reqired index from it.
//So that I get the index from the front.

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length=length+1;
            temp=temp.next;
        }

         temp=head;
        if(length==n){
            head=temp.next;
            return head;
        }
       
        for(int i=0;i<(length-n-1);i++){
            temp=temp.next;
        }
        if(temp.next==null && length==1){
            head=null;
            return head;
        }
        temp.next=temp.next.next;
        return head;
    }
}