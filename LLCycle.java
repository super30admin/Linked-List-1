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
    Set<ListNode> sets = new HashSet<>();
    while( head != null ){
        if( sets.contains(head) ) return head;
        else sets.add(head);
        head = head.next;
    }
    return null;   
    }
}
