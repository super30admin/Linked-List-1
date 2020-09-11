public class ReverseLL{    
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public ListNode reverseList(ListNode head) {
        
// Iterative Solution
        ListNode curr = head ;
        ListNode prev = null;
        ListNode temp;
        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
        
// Recursive Solution
//         if(head == null || head.next == null)
//             return head;
        
//         ListNode newHeadNode = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
        
//         return newHeadNode;
    }
}