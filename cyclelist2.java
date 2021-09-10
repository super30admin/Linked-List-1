
/*

Time: O(n)
Space: O(1)


*/








public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        
        if (head == null)  return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        boolean flag = false;
        
        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        }
        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        
    }
        
        
    }
