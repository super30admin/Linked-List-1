/*
Author: Akhilesh Borgaonkar
Problem: LC 206. Reverse Linked List (Linked List-1)
Approach: Using 2-pointers approach here. Iterating through the linked list with the help of 2 pointers prev and curr. While iterating, 
    I make the next of my current listNode as previous (basically reversing two list nodes) and keep track of my current next node in temp.
Time Complexity: O(n) where n is number of total list nodes in the LinkedList.
Space complexity: O(1) constant.
LC verified.
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode curr = head;
        
        //iterating through the linked list
        while(curr != null){
        //keeping track of next list node to iterate in next loop
            ListNode temp = curr.next;
            curr.next = prev;   //reversing sequence of list nodes curr and prev
            prev = curr;
            curr = temp;        //moving to next list node
        }
        return prev;   //this should be new head now in the reversed linked list
    }
}