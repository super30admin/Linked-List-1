//ITERATIVE 
//Time Complexity: O(N) where N is the number of nodes in the linkedlist
//Space Complexity: O(1)

//Succefully runs on leetcode: 0 ms

//Approach: The iterative approach to reverse the linked list is to take three pointers - prev, curr, fast and manipiulate
//them till we reach the last node by changing the next pointer of each node to its previous node, this way we will get
//the reversed linked list


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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null; ListNode fast = head.next;
        ListNode curr = head;
        
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



//RECURSIVE
//Time Complexity: O(N) where N is the number of nodes in the linkedlist
//Space Complexity: O(N) if we consider the recursive stack space

//Succefully runs on leetcode: 0 ms
//Approach: We perform recursion on each node until the last node and modify the next pointer of the last node to its
//prev node and this operation is performed till all the nodes are covered. In the end, we return the new head which is 
//the last node of the linked list


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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode reverseNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseNode;
    }
}