//TC- O(n)  SC-O(1)
//if we want to use extra space put linkedlist in array then from end of array put it back in linkedlist

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
// class Solution {
//     public ListNode reverseList(ListNode head) {

//     ListNode prev = null;
//     ListNode curr = head;
//     ListNode temp;

//     while(curr != null){
//         temp = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = temp;        
//     }
//     return prev;
//     }
// }


//reverse linkedlist using recurssion, here we do not need to pass pointers, when recurssion will come it will have 
// all the data, with recurssion we will use extra stack space, everytime recurssion function go back to its
// call it will return last node; such as 1>2>3>4>5 when head.next ==null return will be top function on stack 
//that is f(5) ; now head is next function in stack 4 this is head, now we reverse. 
//TC- O(n) SC- O(n)

// class Solution {
//     public ListNode reverseList(ListNode head) {

//         if(head == null || head.next == null) return head;

//         ListNode result = reverseList(head.next);

//         head.next.next = head;

//         head.next = null;

//         return result;

 
//     }
// }

//recurssion with void
class Solution {
    ListNode result;

    public ListNode reverseList(ListNode head) {

    if(head == null) return null;

    helper(head);

    return result;

 
    }

    private void helper(ListNode head){
        if(head.next == null){
            result = head;
            return;

        } 
        reverseList(head.next);
        head.next.next = head;
        head.next = null;



    }
}

