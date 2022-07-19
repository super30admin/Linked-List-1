//Time Complexity: O(n)
//Space Complexity: O(n); Recursion Stack
//Code run successfully on LeetCode.

public class Problem1_Recursive {

    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode reversed = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return reversed;  
    }
}
