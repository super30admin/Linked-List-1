/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */ 
 //find length of cycle, move s ahead by length of the cycle times, move s and f one by one it will meet at start. s n f are two simple pointer
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//        int length = 0;

//         ListNode fast = head;
//         ListNode slow = head;

//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//             if (fast == slow) {
//                 length = lengthCycle(slow);
//                 break;
//             }
//         }

//         if (length == 0) {
//             return null;
//         }

//         // find the start node
//         ListNode f = head;
//         ListNode s = head;

//         while (length > 0) {
//             s = s.next;
//             length--;
//         }

//         // keep moving both forward and they will meet at cycle start
//         while (f != s) {
//             f = f.next;
//             s = s.next;
//         }
//         return s; 
//     }

//     // find length of the cycle
//     public int lengthCycle(ListNode head) {
//         ListNode fast = head;
//         ListNode slow = head;

//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             slow = slow.next;
//             if (fast == slow) {
//                 // calculate the length
//                 ListNode temp = slow;
//                 int length = 0;
//                 do {
//                     temp = temp.next;
//                     length++;
//                 } while (temp != slow);
//                 return length;
//             }
//         }
//         return 0;
//     }
// }

//to find the cycle we need 2x and 1x speed 2 pointers . with 3x or 4x will take more time to detect cycle
//and only 2x will be able to give head of cycle

//2 loops first to find the meting point, move f with 2x and s with 1x where they same their meeting point.
//second loop to find the head of cycle, that is suppose a is distace from head of linkedlist to head of cycle,
// b is dis from head of cycle to meeting point, and c is dis from meeting point to head of cycle. so in this case 
//for slow and fast pointer a+b = 1/2(a+b+c+b) i.e. a = c, so where a=c that is head, meaning we will move fast 
// from meeting point one step and head of linkedlist one step where they meet that is head of cycle.

//TC-O(2n) SC-O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null) return null;
        boolean flag = false;

        ListNode slow = head;
        ListNode fast = head;
       // checking for cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(!flag) return null;
        slow = head;
    
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
  
    return slow;


    }
}
