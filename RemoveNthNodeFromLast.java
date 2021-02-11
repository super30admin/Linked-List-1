/**

Approach is to find the leangth of linkedlist by travering the list
then traverse the list before the elemenet to be removed and then change the pointer 
check if prev is null which is happened when trying to remove head
[1,2] remove 2nd from end which means remove 1


**/

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
        
        if (head == null) return null;
        if (head.next  == null  && n == 1) return null;
        ListNode temp = head;
        ListNode headNext = head;
        int length = getLength(temp);
        int limit =length - n;
        ListNode prev=null;
        while(limit-->0){
            prev = temp;
            temp = temp.next;
        }
        
//         special case for head Removal
        if(prev == null) {
            headNext = headNext.next;
            return headNext;
        }
        if(temp.next == null) {
            prev.next = null;
        }
        
        prev.next = temp.next;
        return headNext;
    }
    
    private int getLength(ListNode node) {
        int i = 0;
        
        while(node != null) {
            node = node.next;
            i++;
        }
        return i;
    }
}
