class Solution {
    ListNode reversed = null;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;
        reversed = reverseList(head.next);
        //st.pop() 4,3,2,1
        head.next.next = head;
        head.next = null;
        return reversed;    
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1,head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        //slow.next.next = null;
        return dummy.next;
        
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(flag == false) return null;
        slow = head;
              
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    
    }
}
