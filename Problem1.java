//Problem 206 : Reverse LinkedList
//Solved successfully on Leetcode and faced no issues
//TC : O(n) SC:O(1) for iterative approach
//TC : O(n) SC:O(n) for recursion approach

class Solution {
    //Recursive solution
    public ListNode reverseList(ListNode head){
        //Base case
        if(head == null || head.next == null){
            return head;
        }
        ListNode newhead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
}
    //Iterative solution 
    // public ListNode reverseList(ListNode head) {
    //     ListNode prev = null;
    //     ListNode temp = null;
    //     ListNode curr = head;
    //     while(curr!=null){
    //         temp = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = temp;
    //     }
    //     return prev;
        
    // }
//}

