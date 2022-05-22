//Time COmplexity: O(n)
//Space COmlexity: O(1)


public class ReverseLinkedList {

      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {

        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;


        while(fast!=null){

            curr.next=prev;
            prev = curr;
            curr =fast;
            fast = fast.next;

        }

        curr.next = prev;
        return curr;
    }
}
