//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}


class Remove_Nth_Node_FromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode deleteNode = dummyNode;
        ListNode lastNode = dummyNode;
        int count = 0;
        while(count < n)
        {
            lastNode = lastNode.next;
            count++;
        }
        
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            deleteNode = deleteNode.next;
        }
        deleteNode.next = deleteNode.next.next;
        return dummyNode.next;
    }
}
