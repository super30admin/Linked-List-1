// Time complexity :O(n)
// Space Complexity :O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Head = head, temp = head;
        while (n > 0 && temp.next != null) {
            temp = temp.next;
            n--;
        }
        if (n == 1)
            return Head.next;
        if (n > 1)
            return null;
        while (temp.next != null) {
            temp = temp.next;
            head = head.next;
        }
        head.next = (head.next).next;
        return Head;
    }

}