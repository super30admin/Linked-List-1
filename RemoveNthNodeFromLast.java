/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 //time - O(n) with constant space
 //19.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
        {
            return null;
        }
        int length = 0;
        ListNode temp = head;
        while(temp != null)
        {
            temp = temp.next;
            length++;
        }
        int count = length - n;
        temp = head;
        if(count == 0 && head.next == null)
        {
            return null;
        }
        while(count > 1)
        {
            temp = temp.next;
            count--;
        }
        if(temp == head && count == 0) 
        {
            head = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
