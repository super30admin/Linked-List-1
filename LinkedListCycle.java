/**
 * Time complexity is O(n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 * https://leetcode.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        int[] a = new int[] {3,2,0,-4};
        ListNode head = new ListNode(3);
        ListNode curr = head;
        for(int i=1; i< a.length; i++){
            curr.next = new ListNode(a[i]);
            curr = curr.next;
        }
        curr.next = head.next;

        ListNode cycleStart = detectCycle(head);
        if(cycleStart != null){
            System.out.println(cycleStart.val);
        }
    }
    private static ListNode detectCycle(ListNode head) {
        //base case
        if(head == null){
            return null;
        }

        ListNode slow = head; // travels at 1x speed
        ListNode fast = head; // travels at 2x speed
        boolean hasCycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //if slow and fast meet, then there is a cycle
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }
        //if there is no cycle we return null
        if(hasCycle == false){
            return null;
        }
        //if there is a cycle, we reset slow pointer to head and the fast pointer
        //is still at the meeting point. After this, both pointers move at 1x speed
        //At this pace, the node at which they meet is the one at which the cycle began
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
     val = x;
     next = null;
    }
 }
