/**
 * The time complexity is O(N) and the space complexity is O(1)
 *
 * Here, if we detect the cycle we count the cycle size say k. The we move temp node till k from start then move both head and temp nodes.
 * The node at which they both meet is the node of the cycle.
 *
 * Yes, the solution passed all the test cases.
 *
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
        ListNode slow = head; ListNode fast = head;

        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return checkCycleStart(head,slow);
            }
        }

        return null;

    }

    public ListNode checkCycleStart(ListNode head,ListNode node){
        int count = 1;
        ListNode temp = node;

        while(temp.next!=node){
            temp = temp.next;
            count++;
        }

        temp = head;
        while(count>0){
            temp = temp.next;
            count--;
        }

        while(head!=temp){
            head = head.next;
            temp = temp.next;
        }

        return temp;
    }
}