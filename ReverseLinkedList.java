/**
 * Time complexity is O(n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for(int i=1; i< a.length; i++){
            curr.next = new ListNode(a[i]);
            curr = curr.next;
        }

        ListNode revHead = reverseList(head);
        while(revHead != null){
            System.out.print(revHead.val + " ");
            revHead = revHead.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}
