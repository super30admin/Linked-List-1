// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

//Sliding Window

public class RemoveNthNode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ReverseLinkedList.ListNode removeNthFromEnd(ReverseLinkedList.ListNode head, int n) {
            ReverseLinkedList.ListNode last = head;
            if(head == null || head.next ==null) {
                return null;
            }
            for(int i=0; i < n ;i++) {
                last = last.next;
            }
            // System.out.println(head.val+"aw " );

            ReverseLinkedList.ListNode start = head;
            ReverseLinkedList.ListNode prev=null;
            while(last!=null) {
                prev=start;
                start =start.next;
                last=last.next;
            }
            if(prev!=null)
                prev.next=start.next;
            else{
                return head.next;
            }
            return head;
        }


}
