
TC:O(n)
SC:O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.
Memory Usage: 34.4 MB, less than 95.79% of Java online submissions for Linked List Cycle II.

Didnot know about the algorithm


public class Solution {
    public ListNode detectCycle(ListNode head) {
        
      ListNode  slow = head;
      ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                slow=head;
                while(slow!= fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
           
            }
                return null;
        }
        
    }
