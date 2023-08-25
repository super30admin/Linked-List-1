// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

//different
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){ //even->fast will reach first & odd->fast.next will reach first
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }

        if(fast == null || fast.next == null)
            return null;

        ListNode ptr1 = head;
        ListNode ptr2 = slow;

        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
        
    }
}
