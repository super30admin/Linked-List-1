import java.util.HashSet;

public class CycleInLinkedList_142 {

    public ListNode detectCycle(ListNode head) {
        // TC - O(N) Asymptotically. Actually it be O(2N) as we are traversing all elements one time then again we are resetting the one of the positions.
        // SC - O(1) - Since we are not using any Auxilary storage it will be O(1)

        if (head == null) {
            return null;
        }
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        boolean isCyclePresent = false;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                fastPointer = head;
                isCyclePresent = true;
                break;
            }
        }
        if (isCyclePresent) {
            while (slowPointer != fastPointer) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
            return slowPointer;
        } else {
            return null;
        }
    }

    public ListNode detectCycleBF(ListNode head) {
        // TC - O(N) - We are iterating through all the elments so it will be O(N) where
        // N is number of nodes.
        // SC - O(N) - Since we are using Hashset of Visited nodes, it will be O(N)
        // where N is number of nodes.
        HashSet<Integer> visited = new HashSet<Integer>();
        if (head == null)
            return head;
        while (head != null) {
            System.out.println(head.val);
            if (visited.contains(head.val)) {
                return head;
            } else {
                visited.add(head.val);
                head = head.next;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CycleInLinkedList_142 cycleInLinkedList_142 = new CycleInLinkedList_142();
        ListNode root = new ListNode().getSampleNodeTwo();
        System.out.println(root);

        // Optimal Solution - Floyd's Algorithm
        ListNode result = cycleInLinkedList_142.detectCycle(root);
        cycleInLinkedList_142.printResults(result);

        // BruteForceSolution
        ListNode resultBF = cycleInLinkedList_142.detectCycleBF(root);
        cycleInLinkedList_142.printResults(resultBF);
    }

    private void printResults(ListNode result) {
        if (result != null) {
            System.out.println("There is cycle in the linked list" + result.val);
        } else {
            System.out.println("There is no cycle in the linked list");
        }
    }
}