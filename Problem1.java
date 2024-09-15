

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // Time Complexity - O(n)
 // Space Complexity - Without recursion stack - O(1)
 //                    With recursive - O(n)
class Solution {
    public ListNode reverseList(ListNode head) {


//         ListNode prev= null, curr = head;

//         while(curr != null){
//             ListNode temp = curr.next;
//             curr.next=prev;
//             prev = curr;
//             curr = temp;
//         }
//         return prev;

        if(head == null)
            return null;

        helper(head).next = null;

        return new_head;


    }

    ListNode new_head = null;
    private ListNode helper(ListNode head){

        if(head.next == null){
            new_head = head;
            return new_head;
        }

        helper(head.next).next = head;
        return head;
    }

}