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

  /*
 Approach :
 -We are given the head of a singly linked list and need to reverse it.\
 - We use **three pointer** to reverse the direction of links:
    1. 'prev': the node that will come before the current node in the reversed list
    2. 'curr': the current node being processed
    3. 'temp': temporarily stores the next node so we dont lose the rest of the list
-At each step, we:
    -Store 'curr.next' in 'temp'
    -Point 'curr.next' to 'prev' (reversing the link)
    -Move 'prev' and 'curr' one step forward
-After the loop, 'curr' will be at the last node(new head), so we link it to 'prev' and return it.

Time Complexity: O(n)
We visit each node exactly once.

Space Complexity: O(1)
- No extra space used except a few pointers
 */

 //Definition for singly linked-list
//  public class ListNode {
//     int val; //Value of the node
//     ListNode next; //Pointer to the next node

//     ListNode() {} //Default Constructor

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode (int val, ListNode next) {
//         this.val =val;
//         this.next = next;
//     }
//  }


class Solution {
    public ListNode reverseList(ListNode head) {
        //Base Case: if the list is empty, return null
        if(head == null) return null;

        ListNode prev = null;   //Previous node (starts from null)
        ListNode curr = head;   //Current node starts at head
        ListNode temp = curr.next; //Store next node temporarily

        //Loop untill we reach the end of the list
        while(temp != null) {
            curr.next = prev;   //Reverse the link: point current's next to previous
            prev = curr;    //Move prev forward to curr
            curr =temp; //Move curr forward to temp
            temp = temp.next; //Move temp to the next node in the original list
        }

        //After the loop, curr is the last node. Reverse its link too.
        curr.next = prev;

        //Return curr, which is now the new head of the reversed list
        return curr;


    }
}