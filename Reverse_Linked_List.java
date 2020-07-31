//Approach: Iterative
//1. I have used 3 pointers, prev, curr and fast to reverse the linked list. While fast will be iterating the list, am changing the direction of the linked list with curr.next = prev.
//2. Then I keep on moving prev to curr and curr to fast, fast to the node next to it. This happens till fast reaches a null. At the end we have to link curr to prev.
//3. Finally returning curr as new head.
public class Reverse_Linked_List {
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast != null)
        {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}

//Time Complexity : O(n) where n is the number of nodes
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :


//Approach: Recursion
//1. Here with recursion, we will reach the end of the list, and start reversing the node by this "head.next.next = head". This way we will remove the ongoing pointer and reverse every single node.
//2. Reversed node is returned to the previous call, thus the whole list gets reversed. 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
      //  System.out.println("<--"+head.val);
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}

//Time Complexity : O(n) where n is the number of nodes
//Space Complexity : O(n) where n is the nodes in the recursive stack
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }