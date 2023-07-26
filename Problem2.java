//19. Remove Nth Node From End of List

/ Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = head;
        ListNode temp = head;
        int j = 1;
        int i = 1;
        while (temp.next != null){
            temp = temp.next;
            j++;
        }
        if (n == j){
            head = head.next;
        }
        else {
            n = (j-n)+1;
            temp = head;
            while (i != n){
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
        }
        return head;
    }
}