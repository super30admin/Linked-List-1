//Approach: Traverse till the sth node,
//Create a sliding window beterrn then make s.next = s.next.next
//Run on Leetcode? Yes
//Time Complexitiy:O(n)
//Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        else{
          ListNode dummy = new ListNode(0);
          dummy.next = head; 
          ListNode f = dummy; //head 
          ListNode s = dummy; //head
            
          for(int i=1;i<=n+1;i++)
              f = f.next; //Go till  1,2,3,4,5 n positons : go till nth pass : there will be a sliding window 
            
          while(f!=null){ //there is a sliding window between the two 
              f = f.next;
              s = s.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }
    }}
