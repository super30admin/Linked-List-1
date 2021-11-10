//Time Complexity : O(N)
//Space Complexity :O(1)



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int totalNodes = 0;
        ListNode ptr = head;
        while (ptr != null) {
            totalNodes++;
            ptr = ptr.next;
        }
        if (totalNodes == 1)
            return null;
        if (n == totalNodes)
            return head.next;
        ptr = head;
        int idx = 1;
        while (idx < (totalNodes - n)) {
            idx++;
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
        return head;
    }
}