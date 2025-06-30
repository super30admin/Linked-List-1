// //Hashmap
// //Move through each node one by one using a pointer.
// //If we've already seen this node before, then it’s the start of the cycle.
// //Otherwise, we keep adding nodes to the set and go forward till the end.
// //Time Complexity: O(n)
// //Space Complexity: O(n)
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashSet<ListNode> set = new HashSet<>();
//         ListNode curr = head;
//         while(curr != null){
//             if(set.contains(curr)){
//                 return curr;
//             }
//             set.add(curr);
//             curr = curr.next;
//         }
//         return null;
//     }
// }


//Two-pointers:
//Use two pointers moving at different speeds to check if there’s a cycle.
//If they meet, reset one to the head and walk both one step at a time.
//They meet again at the node where the cycle starts.
//Time Complexity: O(n)
//Space Complexity: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                flag = true;
                break;
            }
        }
        if (!flag) return null;
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow; //return fast;
    }
}