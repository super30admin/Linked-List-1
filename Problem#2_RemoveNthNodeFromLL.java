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
        int len = 0;
        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode root = head;
        
        while(root!=null){
            root = root.next;
            len++;
        }
        System.out.println("Len is: "+len);
        len = len-n;
        System.out.println("Len-n is: "+len);
        //Reset root again
        root = curr;
        while(len>0){
            root = root.next;
            len--;
            } 
        root.next = root.next.next;
        return curr.next;
    }
}