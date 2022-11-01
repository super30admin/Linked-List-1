// TC:O(n)
// SC:O(1)
// works in leetcode
public class ReverseLinkedListIterative {
    public static  ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr= fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;
    }

    public static void main(String [] args){
        //1,2,3,4,5

        ListNode tail = new ListNode(5,null);
        ListNode node1 = new ListNode(4,tail);
        ListNode node2 = new ListNode(3,node1);
        ListNode node3 = new ListNode(2,node2);
        ListNode head = new ListNode(1,node3);

        ListNode reverse = reverseList(head);
        while(reverse!=null){
            System.out.println(reverse.val);
            reverse = reverse.next;
        }
    }
}
