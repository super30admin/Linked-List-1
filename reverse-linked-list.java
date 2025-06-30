// //Iterative
// //Time Complexity: O(n)
// //Space Complexity: O(1)
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         while (curr!=null){
//             ListNode temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;
//         }
//         return prev;
//     }
// }

// //Recursive: ListNode based recursion
// //Time Complexity: O(n)
// //Space Complexity: O(n), for recursive stack
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         return helper(head,null);
//     }
//     private ListNode helper (ListNode curr, ListNode prev){
//         //base case
//         if (curr == null) return prev;
//         //logic
//         ListNode temp = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = temp;
//         return helper(curr, prev);
//     }
// }

// //Void based recursion
// //Time Complexity: O(n)
// //Space Complexity: O(n), for recursive stack
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         helper(head,null);
//         return result;
//     }
//     private void helper(ListNode curr, ListNode prev){
//         //base case
//         if (curr == null) {
//             result = prev;
//             return;
//         }
//         //logic
//         ListNode temp = curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = temp;
//         helper(curr, prev);
//     }
// }

//Pure Recursion
// //Time Complexity: O(n)
// //Space Complexity: O(n), for recursive stack
class Solution {
    public ListNode reverseList(ListNode head) {
        //base
        if (head==null || head.next==null) return head;
        //logic
        ListNode reversed = reverseList(head.next);
        //System.out.println(head.val) //4 3 2 1
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
