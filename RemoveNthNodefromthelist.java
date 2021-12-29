// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No



// Test Case:
// head = [1,2,3,4,5], n = 2
// output = [1,2,3,5]

//Traverse through the list upto n while maintaining the pointers slow,fast and then when we reach the nth node,
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        //  int count = 0;

        //Move fast pointer ahead so that the gap between slow and fast becomes n
        for(int i = 0;i <= n; i++)
            fast = fast.next;
        //count ++;
        // At this point the fast pointer - slow ptr gives n
        //Move fast ptr to the end, maintaining the gap
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;

        //cannot return head for cases like [1] and n = 1
        return dummy.next;
    }
}