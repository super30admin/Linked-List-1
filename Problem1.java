// Recursive

// Recursive
// Time Complexity - O(n) where n is the number of nodes in the list
// Space Complexity - O(1) Since we are not creating any new nodes
// This solution worked on LeetCode

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){  // return head if it is null or it is last node in the list
            return head;
        }
      ListNode r = reverseList(head.next);  // Call recursively head.next. so first last second node in the list is recursively executed
      head.next.next = head;        // Change the pointer to reverse with first node in the last
      head.next = null;             // Make the first Node point to null since it will be the last node in the reverse list
      return r;                     // return the reverseList result to use the result recursively for the subsequent list nodes.
    }
}

// Non Recursive
// Time Complexity - O(n) where n is the number of nodes in the list
// Space Complexity - O(1) Since we are not creating any new nodes
// This solution worked on LeetCode

// Consider 1->2->3->4
//temp = 3 , curr = 2 and prev = 1 in the start . Now to reverse make curr.next = prev. And then incrememt the prev, curr and temp iteratively to reverse the entire linked list

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
