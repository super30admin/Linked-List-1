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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                //cycle
                ListNode dummy = head;
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
//Time Complexity: O(n)
// Space Complexity: O(1)

/**public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSeen = new HashSet<>();
        while(head!=null){
            if(nodeSeen.contains(head)){
                return head;
            }else{
                nodeSeen.add(head);
            }
            head = head.next;
        }
        return null;
    }
}*/