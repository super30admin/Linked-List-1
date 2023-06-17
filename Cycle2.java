// Time Complexity : O(n) where n is the number of nodes in the list
// Space Complexity : O(n) since we're creating a HashSet and in the worst case there will be n elements in the Set
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

import java.util.HashSet;
public class Cycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        HashSet<ListNode> set = new HashSet<>();
        ListNode current = head;
        set.add(head);
        while(current != null){
            if(set.contains(current.next)){
                return current.next;
            }
            set.add(current.next);
            current = current.next;
        }
        return null;
    }


    // Time Complexity : O(n) where n is the number of nodes in the list
    // Space Complexity : O(1) since we're using no extra space.
    // Did this code successfully run on Leetcode :yes
    public ListNode detectCycleNoExtraSpace(ListNode head){

        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;
            if(slow!= null && fast!= null &&  slow == fast){
                //reset
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
