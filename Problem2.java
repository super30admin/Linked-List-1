// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

// Time Complexity : 2-pointers - O(N)
// Space Complexity : 2-pointers - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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
    // Use two-pointers to do in one pass
    // maintain a difference of n nodes bw the two pointers always 
    // Time - O(n)
    // Space - O(1)
    private ListNode twoPointers(ListNode head, int n){
        // Add a dummy node, for edge cases
        ListNode dummy=new ListNode(-1);

        dummy.next=head;

        ListNode slow=dummy, fast=dummy;
        // To create a distance of n nodes bw two pointers
        int count=0;
        while(count<=n){
            fast=fast.next;
            count++;
        }

        // Move both pointers to reach (n-1)th node at slow pointer
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        // Delete the next node of slow
        ListNode temp=slow.next;
        slow.next=temp.next;
        temp.next=null;

        // return head
        return dummy.next;
    }

    // Single pointer - two pass
    // Time - O(2n) -> O(n)
    // Space - O(1)
    private ListNode twoPass(ListNode head, int n){
        int count=0;
        // Add a dummy node to handle edge cases
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        // First pass - count number of nodes
        ListNode itr=dummy;
        while(itr!=null){
            itr=itr.next;
            count++;
        }

        // Second pass - move "count-n" nodes from head
        // to arrive at (n+1)th node from end
        itr=dummy;
        int idx=1;
        count=count-n;
        while(idx<count){
            itr=itr.next;
            idx++;
        }

        // Remove the node
        ListNode temp=itr.next;
        itr.next=temp.next;
        temp.next=null;

        return dummy.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //return twoPointers(head,n);
        return twoPass(head,n);
    }   
}