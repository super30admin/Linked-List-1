//Time: O(n)
//Space: O(1)
//Did it run successfully on leetcode: yes
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //if head is null or only one element in list;
        if(head == null || head.next==null) return head;
        //create a dummy node
        ListNode dummy = new ListNode(-1);
        //point next of dummy to head
        dummy.next = head;
        //initialize slow and fast pointer
        ListNode slow = head, fast=head.next;
        //untill next of slow is not null
        while(slow.next != null){

            slow.next = fast.next;
            fast.next = dummy.next;
            dummy.next = fast;
            fast = slow.next;
        }
        return dummy.next;
    }
}