Time Complexity: O(n)
Space Complexity: O(1)
Ran successfully on leetcode?: yes

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode curr = head, fast = head.next;
        
        while(fast != null && fast.next != null){
            if(curr == fast) break;
            curr = curr.next;
            fast = fast.next.next;
        }
        
        if(curr == fast){
            curr = head;
            fast = fast.next;

            while(curr != fast){
                curr = curr.next;
                fast = fast.next;
            }
        } else {
            return null;
        }
        return curr;
    }
}
