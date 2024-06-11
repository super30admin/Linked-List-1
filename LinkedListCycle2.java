//Time Complexity - O(n)
//Space Complexity - O(1)
 public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        Listnode slow = head;
        boolean hasCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                hasCycle = true;
                break; //to get out of the cycle once they meet
            }
        }
        if(!hasCycle){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast){
                return slow;
            }
        }


        
    }
}