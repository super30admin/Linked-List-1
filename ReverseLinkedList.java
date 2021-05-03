//Time Complexity: O(n)
//Space Complexity : Recursion:O(n) and Iterative:O(1)
// Did this code successfully run on Leetcode : yes
// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        //recursive
        if(head==null||head.next==null){
            return head;
        }
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
        //iterative
       /* if(head==null){
            return null;
        }
        //use three pointers to keep track of prev ,current and the next node
        ListNode prev=null,cur=head,next=cur.next;
        while(next!=null){
            //connect the current node's next to prev node
            cur.next=prev;
            //let the current node be previous
            prev = cur;
            //after that the next node is the current node
            cur = next;
            //the next node is the next one in the list
            next = next.next;
        }
        cur.next=prev;
        return cur;
        */
    }
}