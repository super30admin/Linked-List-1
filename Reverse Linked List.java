/*
Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

*/


//Iterative Solution
//T: O(n)
//S: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur != null){
            
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
        return prev;
    }
}

//Recursive Solution
//Beats 100% of LeetCode Submissions

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        return reversedList(head, null);
    }
    
    public ListNode reversedList(ListNode head, ListNode newHead){
        
        if(head == null)    return newHead;
        
        ListNode nextNode = head.next;
        head.next = newHead;
        newHead = head;
        return reversedList(nextNode, newHead);
        
    }
}