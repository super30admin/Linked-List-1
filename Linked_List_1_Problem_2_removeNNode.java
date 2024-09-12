//Time complexity : O(n)
//Space complexity : O(1)
//Runs successfully on leetcode
//No problem

//Here we will be using two pointers, we try to maintain distance between these two pointers as n
//We will come to a situation where next pointer of slow will be the node we need to delete



public class Linked_List_1_Problem_2_removeNNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(n!=0)
        {
            fast = fast.next;
            n--;
        }

        if(fast==null)
        {
            return head.next;
        }

        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
