/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
Leet Code Submitted : YES
Time Complexity : O(2N)
Space Complexity : O(N)

Use Stack to store the contents of the list and then pop each element to reverse the list. (Not Optimal)

**/

class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s1 =  new Stack<>();
        
        if(head == null)
            return null;
            
        ListNode temp = head;
        while(temp != null){
            s1.add(temp.val);
            temp = temp.next;
        }
        
        temp = head;
        
        while(temp != null){
            temp.val = s1.pop();
            temp = temp.next;
        }
        
        return head;
        
    }
}
