// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach: floyds algo - once fast and slow meet
// reset slow to head and move fast and slow one step because they start will be at same disatnce from head to start of the loop
// and point where slow and fast meet will be at same distance to start of the loop

//  Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
        next = null;
    }
}

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head, fast = head;
        while(null != fast && null != fast.next)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}