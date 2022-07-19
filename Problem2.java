//Time Complexity: O(n)
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem2 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null)
            return null;
        
        int count = 0;
        
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(count < n){
            
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
