//Time complexity : O(n)

//Space complexity : O(1)
// class Solution {
//     public ListNode reverseList(ListNode head) {
//        if(head == null || head.next == null) return head;
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode fast = head.next;
//         while(fast != null){
//             curr.next = prev;
//             prev = curr;
//             curr = fast;
//             fast = fast.next;
//         }
//         curr.next = prev;
//         return curr;
//     }
// }

// in google asked to solve it using recursion
//second approach
//Time complexity : O(n)

//Space complexity : O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;

    }
}
