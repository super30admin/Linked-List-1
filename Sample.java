// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// take three pointers and change the linkage to point curr next to prev and move forward

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
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=curr.next;
        while(fast!=null){
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;
    }
}

/***************************PROBLEM 2***********************/
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// take two pointers with a gap of n and navigate till we reach end of list, now change the
//1st pointer next to next.next
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

        ListNode dummy=new ListNode(-1,head);
        ListNode slow=dummy;
        ListNode fast=dummy;
        int counter=0;
        while(counter<=n){
            fast=fast.next;
            counter++;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}


/***************************PROBLEM 3***********************/
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// take two pointers with slow and fast, move fast twice as fast as slow if the list is
//cyclic they will meet else fast will become null, return accordingly

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean isCyclic=false;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                isCyclic=true;
                break;
            }
        }
        if(!isCyclic){
            return null;
        }
        fast=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
    }
}