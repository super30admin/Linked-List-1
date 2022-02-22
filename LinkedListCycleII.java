import java.util.HashSet;
/*

Time complexity: O(n)
Space complexity: O(n)
Run on leetcode: yes
Any difficulties: no

 */
public class LinkedListCycleII {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){};
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static void printList(ListNode head){
        ListNode node = head;

        while(node!= null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode linkedListCycleII(ListNode head){
        HashSet<ListNode> alreadyVisited = new HashSet<>();

        ListNode node = head;

        while(node!= null){
            if(alreadyVisited.contains(node)){
                return node;
            }
            alreadyVisited.add(node);
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second;
        linkedListCycleII(head);
        printList(head);
    }
}
