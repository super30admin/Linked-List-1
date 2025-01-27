public class Problem3 {

    // Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        //first make the difference between the slow and fast point to the n so that when fast reaches null our slow is at the pointer where slow.next is the node to be removed;
        int count  = 0;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return temp.next;
    }
}
