public class LinkedListCycleBegin {

        public ListNode detectCycle(ListNode head) {

            // null case
            if(head == null) return null;

            boolean flag = false;

            //initialize both pointers at the head
            ListNode slow = head;
            ListNode fast = head;

            // fast for even case, fast.next for odd case
            while(fast != null && fast.next != null) {

                //move slow by 1x and fadt by 2x
                slow = slow.next;
                fast = fast.next.next;

                // break moving pointers by the above formula when they meet first, reset flag
                if(slow == fast) {

                    flag = true;
                    break;
                }

            }
        /* if flag remains false after the above while loop, pointers did not meet
        and there is no  cycle */
            if(!flag) return null;

            // when flag is true, there is cycle and find out starting point of cycle

        /* move slow to head, keep fast at meeting point and move both by 1x
            distance(head of linked list, head of cycle) ==
            distance(head of cycle, meeting point of pointers)*/
            slow = head;

            // when slow and fast meet, stop
            while(slow != fast) {

                // move pointers after reset by 1x
                slow = slow.next;
                fast = fast.next;
            }

            // output stating point of cycle (slow or fast when they are equal)
            return slow;

        }

}
/* Time Complexity = O(n) - running over all nodes
Space Complexity = O(1) - no extra space */