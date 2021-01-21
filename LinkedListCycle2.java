// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        //two pointer approach
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        //loop until slow and fast are in the same spot - will end if no cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }

        //if no loop
        if(flag == false) return null;
        //|| fast == null || fast.next == null
        //if(fast == null || fast.next == null) return null;

        slow = head;

        //reset one pointer to beginning, move pointers at same speed until at same spot
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}