//Time Complexity O(n)
//Space Complexity O(1) for reverseList2 and O(n) for reursive implementation (reverseList)
//Leetcode tested

public class ReversedLinkedList {
    public static ListNode reverseList2(ListNode head) {
        ListNode prev=null;
        ListNode index = head;
        ListNode temp = head;
        while (index!=null){
            temp = index.next;
            index.next=prev;
            prev=index;
            index=temp;
        }
        return prev;
    }

    //Recursive Solution
    static ListNode reversed;
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        reversed=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return reversed;
    }
}
