// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)
// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]

// In this we are using 3 pointers 
// prev=null
// curr=head
// fast=head.next
// and we are assigning value of prev to curr.next
Time Complexity : O(n);
Space Complexity : O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=head.next;
        while(fast!=null){
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;
    }
}

//Recusive Solution
// Time Complexity : O(n)
// Space Complexity : O(n) => here it's not a tree so no O(h)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode reversedList = reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reversedList;
        
    }
}