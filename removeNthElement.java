//Time complexity: O(n)
//Space complexity: O(1)
//Executed on leetcode.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode node = dummy;
        ListNode output = dummy;
        
        while(node.next!=null)
        {            
            
            if(n<=0)
            {
                output = output.next;       //Taking a dummy head value to handle edge case.
            }                                  //Taking first pointer moves from the beginning and second pointer moves after n iterations. Taking the values from second pointer LinkedList and skipping one value when we reach end with fast pointer.
            node = node.next;
            n--;
            
        }
        output.next = output.next.next;
        return dummy.next;
    }
}