
//TC will be O(n)
//SC will be O(1)

//Definition for singly-linked list.
class ListNode {
    int val;
    listnode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class linkedListCycle {
    public listnode detectCycle(listnode head) {
        if(head == null){
            return null;
        }
        listnode slow = head;
        listnode fast = head;
        boolean hasCycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }

        fast = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    public static void main(String[] args){
        listnode head = new listnode(1);
        listnode node2 = new listnode(2);
        listnode node3 = new listnode(3);
        listnode node4 = new listnode(4);
        listnode node5 = new listnode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        // Create a cycle by connecting the last node to the second node
        node5.next = node2;

        // Create an instance of the linkedListCycle class
        linkedListCycle solution = new linkedListCycle();

        // Detect and print the start of the cycle (if it exists)
        listnode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }
}


