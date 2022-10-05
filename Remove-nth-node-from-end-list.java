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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            len +=1;
        }
        len -= n;
        if(len <= 0){
            return head.next;
        }
        temp = head;
        for(int i = 1; i < len; i++){
            temp = temp.next;       
        }
        temp.next = temp.next.next;
    return head;
    }
}