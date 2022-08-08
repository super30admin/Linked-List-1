//REVERSE_lINKED_LIST
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach:Here we just need to reverse the direction of node flow
//to achieve this we use three pointers prev,curr and fast.intially we point prev to null ,curr to head and fast to curr.next.
//We traverse in this flow till our fast reaches null.

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
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

// Remove Nth Node From End of List
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: Here we need to delete nth node from the end of the list.
//  Intially we maintain a dummy node which points to the head of the list.Here we will use fast and slow pointers.
//The fast will travel till n from the fast which is equal to length-n from the end.Then we will move both the slow and
//fast with same speed till fast reaches null. Here slow will travel l-n from the dummy which means l-n-1from the head.
//slow will be before the node to be deleted. so we will point slow.next to slow.next.next by deleting the desired node.+

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        if(head==null) return null;
        ListNode slow=dummy;
        ListNode fast=dummy;
        int count =0;
        while (count<=n){
            fast=fast.next;
            count++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

    }
}


//142. Linked List Cycle II
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: Here will use slow and fast pointers to check whether cycle
//exists. Intially fast moves at 2x speed and and slow at 1x. If there is any cycle then they wull meet at some point.
//After that we keep the slow to head and traverse fast from that point. Then they both will meet at that point where the cycle starts.

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        boolean flag= false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow == fast){
                flag=true;
                break;
            }
        }
        if(!flag) return null;
        slow=head;
        while(fast!=slow){
            fast=fast.next;
            slow = slow.next;
        }
        return slow;
    }
}