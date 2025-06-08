//Problem 142 LinkedList Cycle 2
//Solved successfully on leetcode and faced no issues
//TC:O(n) SC:O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){ //checking if there is a cycle or not
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break; 
            }
        }
            if(flag == false){ //if there is no cycle , return null
                return null; 
            }
        
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
    }
}
