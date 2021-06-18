/*Approach - traverse list and change the pointer in reverse direction
 * SC, TC - O(1), O(N)
 *
 * */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while(head != null){
            temp = head;
            head = head.next;
            temp.next = prev;
            prev = temp;
        }
        
        return prev;
    }
}
