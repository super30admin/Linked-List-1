// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Here intution is we need to find gap of n between slow and fast pointer. For that we are using count.

class RemoveNthNode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        ListNode slow = dummy;
        while(fast != null){ // Will travel till fast reached null so that slow will reach just one node before the n.
            fast = fast.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;  //We will save the next pointer and connect slow to next to next.
        slow.next = slow.next.next;
        return dummy.next;
    }
}