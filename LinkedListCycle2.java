/*
Time Complexity : O(n)
Cycle Detection Phase: The slow and fast pointers traverse up to n nodes to detect a cycle (in the worst case).
This takes O(n) time.
Cycle Starting Node Detection Phase: After detecting the cycle, the algorithm resets one pointer to the head and
moves both pointers one step at a time. This phase also traverses up to n nodes in the worst case. This takes
another O(n) time.
O(n) + O(n) = O(2n) => O(n)

Space Complexity : O(1)
Did this code successfully run on Leetcode: Yes
*/

//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head)
    {
        if(head == null) return null; //look at the first constraint, head can be null
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = true;

        //To find if there is a cycle or not
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            //if slow and fast meet means there is a cycle
            if(slow == fast)
            {
                flag = false;
                break;
            }
        }

        if(flag) return null; //means no cycle if flag is true

        /*
            find the node where cycle begins, the node is equidistant from the beginning (head) of the cycle and
            the meeting point of slow and fast pointer
        */
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}