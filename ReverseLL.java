// Time Complexity : O(n) n is number of nodes.
// Space Complexity : O(1) through iteration, O(n) for recursing as we use the internal stack space.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class ListNode {
         int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
class Solution {
    private ListNode recursion(ListNode head)
    {
        //this is using prev as parameter
        // if(head == null)
        //     return prev;

        // ListNode temp = head.next;
        // head.next = prev;
        // return recursion(temp, head);


        //this approach is just using head and no other parameter
        if(head == null || head.next == null)
            return head;
        
        ListNode temp = recursion(head.next);
        head.next.next = head;
        head.next = null;

        return temp;
    }
    public ListNode reverseList(ListNode head) {
        return recursion(head);
    }
    //this approach is through iteration
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode curr = head;

    //     while(curr != null)
    //     {
    //         ListNode temp = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = temp;
    //     }
    //     return prev;
    // }
}
