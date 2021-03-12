// TC - O(n), SC - O(1)

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         Set<ListNode> set = new HashSet<>();
        
//         ListNode temp = head;
//         while(temp != null){
//             if(set.contains(temp)){
//                 return temp;
//             }
//             set.add(temp);
//             temp = temp.next;
//         }
//         return null;
//     }
// }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                // cycle exists
                ListNode dummy = head;
                // As from formula deduction, x = z
                while(dummy != slow){
                    slow = slow.next;
                    dummy = dummy.next;
                }
                return slow;
            }
        }
        return null;
    }
}