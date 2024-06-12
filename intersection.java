// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = 0; // lenght of linked list 1
        int lenB = 0; // length of linked list 2
        ListNode curr = headA;
        while (curr != null) { // incrementing till end of linked list 1
            curr = curr.next;
            lenA++;
        }
        curr = headB;
        while (curr != null) { // incrementing till end of linked list 2
            curr = curr.next;
            lenB++;
        }
        while(lenA > lenB){ // placing the head pointer so that both the linked list have nodes remaining at the end
            headA = headA.next;
            lenA--;
        }
        while(lenB > lenA){ // placing the head pointer so that both the linked list have nodes remaining at the end
            headB = headB.next;
            lenB--;
        }
        while(headA != headB){ // reaching the intersection
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}