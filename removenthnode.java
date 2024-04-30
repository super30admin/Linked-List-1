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
        ListNode dummy = new ListNode(-1); //Value of the new list node is -1
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        ListNode temp;
        int count = 0;

        while(fast!=null){
            if(count <= n){
                fast = fast.next; //Fast moves till count is less than or equal to n
                count++;
            } else{
                slow = slow.next; //After that both slow and fast will move
                fast = fast.next;
            }
        }
        temp = slow.next; //Store slow.next at temp
        slow.next = slow.next.next;  //Store slow.next.next at slow.next
        temp.next = null;
        return dummy.next; //Return the head of the list and as head can also be the elem that was removed we return dummy.next
    }
}