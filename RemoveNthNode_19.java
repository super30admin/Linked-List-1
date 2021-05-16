import java.util.*;

public class RemoveNthNode_19 {

    public ListNode removeNthNodeBF(ListNode root, int index) {
        //TC: O(N) - Two passes. Visiting all the nodes.
        //SC: O(N) - ArrayList is Used for Auxilary purpose.
        if (root == null)
            return root;
        ArrayList<ListNode> listOfNodes = new ArrayList<ListNode>();
        while (root != null) {
            listOfNodes.add(root);
            root = root.next;
        }
        listOfNodes.remove(listOfNodes.size() - index);

        ListNode nextNode = null;
        ListNode currentNode = null;
        for (int i = listOfNodes.size() - 1; i >= 0; i--) {
            currentNode = listOfNodes.get(i);
            currentNode.next = nextNode;
            nextNode = currentNode;
        }
        return currentNode;
    }

    public ListNode removeNthNodeBF2(ListNode root, int index) {
        //TC: O(N) - Asymptotically it will be O(2N) One pass get the count and another pass to remove the node. 
        //SC: O(1) - No Extras space is used.
        if (root == null)
            return root;

        ListNode head = root;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        int position = count - index;
        int currentIndex = 0;
        head = root;

        while (head != null) {
            if (currentIndex == position) {
                if(head.next != null) {
                    head.next = head.next.next;
                    break;
                }
            } else {
                head = head.next;
                currentIndex++;
            }
        }
        return root;
    }

    public ListNode removeNthNode(ListNode root, int index) {
        //TC: O(N) - Asymptotically it will be O(2N) One pass to move the fast pointer to exact index and another pass to remove the node. 
        //SC: O(1) - No Extras space is used.

        if (root == null || index == 0)
            return root;
 
        ListNode dummNode = new ListNode(-1);
        dummNode.next = root;
        ListNode slowPointer = dummNode;
        ListNode fastPointer = dummNode;
        int count = 0;
        while(count < index) {
            fastPointer = fastPointer.next;
            count++;
        }

        while(fastPointer.next !=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
        return dummNode.next;
    }

    public static void main(String[] args) {
        RemoveNthNode_19 removeNthNode_19 = new RemoveNthNode_19();
        ListNode root = new ListNode().getSampleNodeOne();
        ListNode result = removeNthNode_19.removeNthNode(root, 2);
        System.out.println(result.val);
    }
}
