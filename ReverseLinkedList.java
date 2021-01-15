/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// Iterative 
// TC: O(N) : N -> no. of nodes in the linked list
// SC: O(1)
// Did it run successfully on Leetcode? : Yes
// class Solution {
//     public ListNode reverseList(ListNode head) {
//        if (head == null)
//            return null;
//         ListNode prev = null;
//         ListNode cur = head;
//         while ( cur != null)
//         {
//             ListNode temp = cur.next;   
//             cur.next = prev;
//             prev = cur;
//             cur = temp;
//         }
//         return prev;
//     }
// }

// Recursive code of the above approach
// TC: O(N) : N -> no. of nodes in the linked list
// SC: O(1)
// Did it run successfully on Leetcode? : Yes
// class Solution {
//     public ListNode reverseList(ListNode head) {
//        if (head == null)
//            return null;
//         ListNode prev = null;
//         ListNode cur = head;
//        return helper(prev, cur);
//     }
//     private ListNode helper(ListNode prev, ListNode cur)
//     {
//         // base
//         if ( cur == null)
//             return prev;
//         // logic
//         if ( prev != null)
//         System.out.println("prev " + prev.val);
//         if ( cur != null)
//          System.out.println("cur " + cur.val);
//         ListNode temp = cur.next;
//         cur.next = prev;
//         prev = cur;
//         return helper(cur, temp);
//     }
// }



// Recursive 
// TC: O(N) - >  no. of nodes in the linked list
// SC: O(N) -> recursive stack
// Did it run successfully on Leetcode? : Yes
class Solution {
    public ListNode reverseList(ListNode head) {
        // base case
        if ( head == null || head.next == null)
            return head;
        
        // logic
        ListNode reversed = reverseList(head.next);
       // reversed = 5
        // head = stack.pop() 
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}

//Iterative solution of the approach above
// TC: O(N): N -> no. of nodes in the linked list
// SC: O(N) -> stack
// Did it run successfully on Leetcode? : Yes
// class Solution {
//     public ListNode reverseList(ListNode head) {
//        if ( head == null) 
//            return null;
        
//         Stack<ListNode> stack = new Stack();
//         while ( head.next != null)
//         {
//             stack.push(head);
//             head = head.next;
//         }
//         ListNode reversed = head;
//         while ( !stack.isEmpty())
//         {
//          head = stack.pop();
//          head.next.next = head;
//          head.next = null;
//         }
//       return reversed;
//     }
// }
