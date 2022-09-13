/* 
Time Complexity: O(N)
Space Complexity: O(1)
*/
class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        
        int removeIndex = length(head) - n;
        ListNode current = head;
        
        for (int i=0; i<removeIndex-1; i++)
            current = current.next;
        
        if (removeIndex == 0)
            return head.next;
        else
            current.next = current.next.next;
        return head;
    }
    
    int length(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        return length;
    }
}