// Time Complexity : O(N)
// Space Complexity : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {


        int count = 0;

     
        ListNode fast = head, slow = head;


        while(count <= n && fast != null){
            fast = fast.next;
            count++;

        }

        if(fast == null && count <= n)
            return head.next;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;            
        }

        slow.next = slow.next.next;

        return head;


    }
} 