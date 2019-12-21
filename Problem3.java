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
/**
Leet Code Submitted : YES
Space Complexity : O(N)
Time Complexity : O(N) 

The idea is to use HashSet to store the previous found node and then check if the node already exists. If yes then thats the cycle.
**/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        int flag = 0;
        
        if(head == null)
            return null;
        
        while(head != null){
            //System.out.println(s);
            if(s.contains(head)){
                //System.out.println(out.val);
                //return out;
                flag = 1;
                break;
            }
            s.add(head);
            head = head.next;
        }
        if(flag == 1)
            return head;
        
        return null;
    }
}
