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

        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }

    //Time and space O(n)
    // public ListNode detectCycle(ListNode head) {

    //     Set<ListNode> set = new HashSet<>();

    //     while(head!=null){
    //         if(set.contains(head)){
    //              return head;
    //         }else{
    //             set.add(head);
    //         }
    //         head = head.next;
    //     }

    //     return null;

    // }
}