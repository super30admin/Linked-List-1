/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
//         int count = 0;
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode temp = head;
        
//         while(temp != null)
//         {
            
//             temp = temp.next;
//             count++;
//         }
        
//         count = count - n;
//         ListNode cur = dummy;
        
//         while(count > 0)
//         {   count--;
            
//             cur = cur.next;
//             System.out.println(cur.val);
//         }
        
//         cur.next = cur.next.next;
        
//         return dummy.next;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(count <= n)
        {   count++;
            fast = fast.next;
            
        }
        
        while(fast != null )
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}