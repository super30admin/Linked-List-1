// Recursive

// Recursive
// Time Complexity - O(n) where n is the number of nodes in the list
// Space Complexity - O(1) Since we are not creating any new nodes
// This solution worked on LeetCode




// Non Recursive
// Time Complexity - O(n) where n is the number of nodes in the list
// Space Complexity - O(1) Since we are not creating any new nodes
// This solution worked on LeetCode

// Consider 1->2->3->4
temp = 3 , curr = 2 and prev = 1 in the start . Now to reverse I will  

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){   // If head is null or head.next is null return the head.
            return head;
        }
      ListNode temp = null;            
      ListNode curr = head.next;
      ListNode prev = head;
      prev.next = null;
      while(curr != null){
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
      }
      return prev;
    }
}
