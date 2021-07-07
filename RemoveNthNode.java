/*
Author: Akhilesh Borgaonkar
Problem: LC 19. Remove Nth Node From End of List (Linked List-1)
Approach: Using 2-pointers approach here. Iterating through the linked list with the help of 2 pointers slow and fast. Initially, I start with
    maintaining a distance of n between my slow and fast pointers. Then, I iterate through the linked list one list node at a time. When the fast
    pointer reaches end of Linked List, it means slow has reached the nth node from end as I had maintained a distance of n between slow and fast
    pointers. Now, I just remove the list node next to the slow pointer by pointing to the next.next list node.
Time Complexity: O(n) where n is number of total list nodes in the LinkedList.
Space complexity: O(1) constant.
LC verified.
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //Base case when list has 1 node or no nodes
        if(head == null || head.next == null)
            return null;
        //appending a dummy node at the start of my new reversed list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count < n){
            fast = fast.next;   //maintain n distance between slow and fast pointers
            count++;
        }
        
        while(fast.next != null){   //iterating through the linked list while fast ptr reaches end of the list
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next; //once fast ptr reaches end of list, slow pointer points to the previous of the nth node from end
        //removed the nth node from the list
        
        return dummy.next;  //return new head of reversed list
        
    }
}