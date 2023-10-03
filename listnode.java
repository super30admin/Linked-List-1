//TC will be O(n)
//SC will be O(1)

// Definition for singly-linked list.
public class listnode {
    int val;
    listnode next;
    listnode() {}
    listnode(int val) { this.val = val; }
    listnode(int val, listnode next) { this.val = val; this.next = next; }
}

class removeNodeFromEnd {
    public listnode removeNthFromEnd(listnode head, int n) {
        if(head == null){
            return head;
        }

        listnode dummy = new listnode(-1);
        dummy.next = head;
        listnode slow = dummy;
        listnode fast = dummy;
        int count = 0;

        while(count <= n){
            fast = fast.next;
            count++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

        public static void main(String[] args) {
            // Create a sample linked list
            listnode head = new listnode(1);
            listnode node2 = new listnode(2);
            listnode node3 = new listnode(3);
            listnode node4 = new listnode(4);
            listnode node5 = new listnode(5);

            head.next = node2;
            node2.next = node3;
            node3.next = node4;
            node4.next = node5;

            int n = 2; // The position of the node to remove from the end

            // Create an instance of the removeNodeFromEnd class
            removeNodeFromEnd solution = new removeNodeFromEnd();

            // Remove the nth node from the end and print the updated list
            listnode newHead = solution.removeNthFromEnd(head, n);

            // Print the updated linked list
            System.out.print("Updated Linked List: ");
            printLinkedList(newHead);
        }

        // Helper method to print the linked list
        public static void printLinkedList(listnode head) {
            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
            System.out.println();
        }

}