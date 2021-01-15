// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//I will be storing the nodes in the hashmap and in each iteration check if that element is present in the list.

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
        HashMap<ListNode,ListNode> hash=new HashMap<ListNode,ListNode>();
        ListNode node=head;
        while(node!=null){
            if(hash.containsKey(node)){
                return node;
            }else{
                hash.put(node,node);
            }
            node=node.next;
        }
        return null;
    }
}