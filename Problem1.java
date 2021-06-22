// Time Complexity : O(N)
// Space Complexity : O(1)
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null, cur = head, next = null;

        if(head == null)
            return null;


        while(cur.next != null){
            next = cur.next;  
            cur.next = prev;
            prev = cur;
            cur = next;

        }
        cur.next = prev;
        return cur;        
    }
}