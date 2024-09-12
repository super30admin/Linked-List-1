//time complexity: O(n)
//space complexity: O(n)
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1 = head;
        ListNode ptr2 = head;
        int len = 0;
        
        while(ptr1.next != null)
        {
            ptr1 = ptr1.next;
            len++;
            if(len > n)
                ptr2 = ptr2.next;                
        }
        
        if (len < n)
        {
            return head.next;
        }

        ptr2.next = (ptr2.next != null? ptr2.next.next : null);
        return head;
    }
    
}