// Detect cycle in linkedList and return the node that marks the beggining of the cycle
// We use Map to check if we already visited the node and then return if we encounter it again
// TC: O(n) we are visiting each node only once except the node which cycle begins - which is visited twice but is negligble. so overall - O(n)
// SC: O(n) We have a map storing each node

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
        if(head == null || head.next == null || head.next.next == null){
            return null;
        }
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode node = head;
        while(node!=null){
            // If map contains the node, that means cycle is encountered so we return node
            if(map.containsKey(node)){
                return node;
            }
            // Otherwise we add current node to map and go to next node
            else{
                map.put(node, node.val);
                node = node.next;
            }
        }
        return null;
    }
}
