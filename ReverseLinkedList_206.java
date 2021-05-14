public class ReverseLinkedList_206 {

    public ListNode reverseLinkedListNormalWay(ListNode root) {
        //TC: O(N) Since we are traversing through all the elements. It will be O(N)
        //SC: O(1) As we are not using any extra space.
        ListNode currentNode = root;
        ListNode previousNode = null;
        while(currentNode != null) {
            ListNode tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;
        }
        return previousNode;
    }

    public static void main(String[] args){
        ReverseLinkedList_206 reverseLinkedList_206 = new ReverseLinkedList_206();
        ListNode root = new ListNode().getSampleNodeThree();
        ListNode result = reverseLinkedList_206.reverseLinkedListNormalWay(root);
        System.out.println(result);
    }
}