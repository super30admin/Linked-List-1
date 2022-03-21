//Time Complexity O(n^2) for removeNthFromEnd2 O(n) for removeNthFromEnd
//Space Complexity O(1) for both implementation
//Leetcode tested

public class RemoveNthElementFromEndLinkedList {
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode index = head;
        ListNode tempIndex = index;
        int count = n;
        while(tempIndex!=null){
            int tempCount=count+1;
            tempIndex=index;
            for (int i = 0; i < tempCount; i++) {
                tempIndex=tempIndex.next;
            }
                index=index.next;
        }
        index.next=index.next.next;
        return head;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy  = new ListNode(-1);
        ListNode fast = dummy;
        ListNode slow = dummy;
        dummy.next=head;
        int count=0;
        while (count<n){
            fast=fast.next;
            count++;
        }
        while (fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
