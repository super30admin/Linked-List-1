/*
 * Time Complexity : O(n)
 * Space Complexity :  O(h)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - To reverse the LinkedList we consider 3 additional pointers, prev, cur, fast. Intitally our prev points to null, cur points to head and fast points to head.next, i.e. second element.
 * We iterate until fast becomes null. We point the cur.next to prev, change prev to cur, cur to fast and fast to fast.next. At the end we just point the last element(cur). next to the prev 
 * and return cur as head of the reversed ll.
 */

//https://leetcode.com/problems/reverse-linked-list/description/

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
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        if(head==null)return null;
        ListNode cur = head;
        ListNode fast = head.next;
        while(fast!=null){
            cur.next=prev;
            prev=cur;
            cur=fast;
            fast=fast.next;
        }
        cur.next=prev;
        return cur;
    // if(head==null || head.next==null)return head;
    //     ListNode reversedHead = reverseList(head.next);
    //     head.next.next=head;
    //     head.next=null;
    //     return reversedHead;
    }
}