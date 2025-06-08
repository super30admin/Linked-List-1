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
 //Time complexity - O(n)
 //Space complexity - O(1)
 // Did you face any issues - No
 // Solved on leet code - yes
 // Initially calculating the length of the linked list. nth Element from last will be length-nth element from begining. hence remove it by storing the next reference in temp
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode t = head;
        int l = getLength(t);
        if(l == 1) return null; else {
        int fromFront = l-n, i=1;
        if (fromFront == 0) return head.next;
        t = head;
        while(i<fromFront) {
            t = t.next;
            i++;
        }
        ListNode temp = t.next.next;
        t.next = temp;
        return head;
        }
    }

    public int getLength(ListNode t) {
        int count = 1;
        while(t.next != null) {
            count++;
            t = t.next;
        }
        return count;
    }
}
