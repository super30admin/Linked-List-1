public class LinkedListCycle2 {
    public static ListNode detectCycle(ListNode head) { //O(n) T.C, O(1) S.C
        //Using hare and tortoise algorithm to check if there is a cycle
        ListNode slow = head; //tortoise
        ListNode fast = head; //hare
        boolean hasCycle = false; //check if it has cycle

        while(fast != null && fast.next != null) { //checking for even and odd length size in linked-list
            slow = slow.next; //slow goes 1x speed
            fast = fast.next.next; //fast goes 2x speed
            if(slow == fast) { //if slow and fast are equal
                hasCycle = true; //it has a cycle
                break; //no need to continue further
            }
        }

        if(!hasCycle) return null; //if there is no cycle, return null as asked

        fast = head; //re-assign fast to head
        while(fast != slow) { //until fast and slow become same again
            slow = slow.next; //increment 1x speed because if there is a cycle
            fast = fast.next; //the distance between head to circular-head is same as
            //from when both pointers meet to circular-head
        }

        return slow; //return either fast or slow
    }

    public static void main(String[] args) {
        // Create a linked list: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        // Create a cycle: -4 -> 2
        node4.next = node2;

        // Detect cycle
        ListNode cycleNode = detectCycle(head);

        if (cycleNode != null) {
            System.out.println("Cycle starts at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}