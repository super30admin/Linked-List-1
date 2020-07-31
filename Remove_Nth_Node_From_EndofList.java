//Approach:
//1. Here we use two pointers, slow and fast, initially, we move fast till n, so that slow and fast have a distance of n nodes.
//2. Now, we move both slow and fast, till fast reaches null. At the end of this loop, slow will be in a position before nth node from end of the list. 
//3. Thus we can remove by pointing slow's next pointer to the node after it.
//4. If incase to remove the head node, we will use a dummy node and start traversal from that.

public class Remove_Nth_Node_From_EndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode(-1);
        ListNode slow = sentinel;
        ListNode fast = sentinel;
        sentinel.next = head;
        int count = 0;
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }
      
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
         
        slow.next = slow.next.next;
        return sentinel.next;
    }
}
//Time Complexity : O(n) where n is the number of nodes
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :