public class reverselist {
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

        // Time Complexity : O(n)
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode : yes
        // Any problem you faced while coding this :
        //approach: we take 3 pointers:prev,curr,temp; we point the curr.next to prev. we use temp so that we dont lose the right
        //part of the linked list as we break the curr.next; we then move the prev->cur;cur->temp;temp->temp.next; at last when cur
        //is null, we return the prev as it is the head of the reverse list.

        // Your code here along with comments explaining your approach
        ListNode prev=null;
        ListNode cur=head;
        ListNode temp;
        while(cur!=null)
        {
            temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;

        // Time Complexity : O(n)
        // Space Complexity : O(n)-> stack space
        // Did this code successfully run on Leetcode : yes
        // Any problem you faced while coding this :
        //approach: we call the function recursively until the head.next is null.so now we are at the last element. as this is the last element
        //and becomes the head, we store in a result. we then point the head.next.next link to the head. at last we return the head.

        // Your code here along with comments explaining your approach




        ListNode result=new ListNode();
        if(head==null || head.next==null) 
        {
            result=head;
            return result;
        }
        result =reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return result;
    }
}
}
