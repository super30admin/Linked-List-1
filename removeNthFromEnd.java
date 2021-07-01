// TC: O(N)
// SC: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode slow =dummyHead;
        ListNode fast = dummyHead.next;
        int count=0;
        while(fast!= null){
            if(count <n){
                fast = fast.next;
            }
            else{
                slow = slow.next;
                fast = fast.next;
            }
            count++;
        }
        slow.next = slow.next.next;// deleting
        return dummyHead.next;
    }
}
