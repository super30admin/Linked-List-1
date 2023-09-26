// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Find the length of the linked list and then find the position of the removing node from the start
 * Traverse the linked list using 2 pointers, and change the next of previous of the removal node to the current node's next
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        int count=0;
        while(fast != null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            count+=1;
        }
        if(fast == null)
            count*=2;
        else
            count = count*2 +1;
        ListNode prev = head;
        ListNode curr = head;
        int rem = count - n;
        if(rem==0)
            head=head.next;
        while(rem > 0){
            prev = curr;
            curr = curr.next;
            rem--;
        }
        prev.next = curr.next;
        return head;
    }
}