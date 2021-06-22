// Time Complexity: O(N)
// Space Complexity: O(1)
// Run on Leetcode: Yes
// Issues: Had to think on how to solve the remove head issue.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        int counter = 0;
        
        while(fast!=null && fast.next != null){
            fast = fast.next;
            counter++;
            if(counter>n)
                slow = slow.next;
        }
        if(counter < n)
            head = head.next;
        else
            slow.next = slow.next.next;
        return head;
    }
}

// OR

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int counter = 0;
        while(counter != n+1){
            fast = fast.next;
            counter++;
        }   
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}
