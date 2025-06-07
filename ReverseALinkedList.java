// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Iterative Solution using three pointers

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
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

//ListNode based recursion solution using three pointers

class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }

    private ListNode helper(ListNode curr, ListNode prev){
        //base
        if(curr == null)
            return prev;
        //logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        return helper(curr, prev);
    }
}

//Void based recursion solution using three pointers
class Solution {
    ListNode result;
    public ListNode reverseList(ListNode head) {

        helper(head, null);
        return result;
    }

    private void helper(ListNode curr, ListNode prev){
        //base
        if(curr == null){
            result=prev;
            return;
        }
            
        //logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
        helper(curr, prev);
    }
}

//Recursion without pointers: List based recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        //base
        if(head == null || head.next == null)
            return head;
        ListNode reversedHead = reverseList(head.next); //reverseHead is global ListNode not passed as parameter of reursion function
        //System.out.print(head.val);// 4 3 2 1
        //System.out.print(reversedHead.val); // 5 5 5 5
        head.next.next = head;
        head.next = null;
        return reversedHead;  
    }
}

//Recursion without pointers: Void based recursion
class Solution {
    ListNode reverseHead;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return reverseHead;
    }

    private void helper(ListNode head){
        if(head == null || head.next == null){
             reverseHead = head;
             return;
        }
           
        
        helper(head.next); // 4 3 2 1
        head.next.next = head;
        head.next = null;
    }
}
