//Problem 19 : Remove Nth node from End of list
//solved successfully onleetcode and faced no issues
//TC : O(n) SC:O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null){
            return null;
        }
        ListNode dummynode = new ListNode(-1);
                ListNode fast = dummynode;

        dummynode.next = head;
        for(int i = 1; i<=n ; i++){
            fast = fast.next;
        }
        ListNode slow = dummynode;
        while(fast.next!=null){
            slow =  slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummynode.next;

        
    }
}