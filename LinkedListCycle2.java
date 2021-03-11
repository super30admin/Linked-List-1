// Maintain two pointers and move the first pointer by one node at a time, and the second pointer by 2 nodes at a time, when the 2 pointers meet we know that the list has a 
// cycle, now point the first pointer to head, and move both the first and second pointers at one node at a time, the point where they both meet is the point where the cycle starts. 

// Time Complexity : O(n), where n is the number of nodes in the given list 
// Space Complexity : O(1)

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode firstPtr = head, secondPtr = head;
        boolean hasCycle = false;

        while (secondPtr != null) {
            firstPtr = firstPtr.next;
            if (secondPtr.next == null)
                return null;
            secondPtr = secondPtr.next.next;

            if (firstPtr == secondPtr) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle)
            return null;

        firstPtr = head;
        while (firstPtr != secondPtr) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        return firstPtr;
    }
}
