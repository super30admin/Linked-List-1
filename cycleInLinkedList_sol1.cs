//https://leetcode.com/submissions/detail/637145969/
//Time: O(n)
//Space: O(n)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode DetectCycle(ListNode head) {
               
        HashSet<ListNode> set = new HashSet<ListNode>();
        
        //will the reference of head change if I change head? yes
       
        
        ListNode dummy = new ListNode(Int32.MinValue);
        dummy.next = head;
        
        ListNode temp = dummy;
        int index;
        int i = -1;
        
        while(temp != null) {
            if(set.Contains(temp.next)) {
                return temp.next;
            }    
            else {
                set.Add(temp.next);
            }
            temp = temp.next;
        }
        return null;
    }
}