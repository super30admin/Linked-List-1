//142. Linked List Cycle 2 - https://leetcode.com/problems/linked-list-cycle-ii/description/
//Time Complexity: O(n)
//Space Complexity:  O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //starting position of slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = true;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //if they meet
            if(slow == fast){
                //there is a cycle
                flag = false;
                break;
            }
        }
        //flag is still true; no cycle
        if(flag){
            return null;
        }

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}