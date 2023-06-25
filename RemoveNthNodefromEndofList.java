public class RemoveNthNodefromEndofList {


        public ListNode removeNthFromEnd(ListNode head, int n) {

            // create a dummy node before the head
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            // start pointers at dummy
            ListNode slow = dummy;
            ListNode fast = dummy;

            // create desired gap between pointers
            int count = 0;
            while(count <= n) {

                fast = fast.next;
                count++;
            }

            // keep moving pointers right till fast is null
            while(fast != null) {

                fast = fast.next;
                slow = slow.next;
            }

            //now slow is a step behind the node to be removed, update pointers
            ListNode temp = slow.next;

            slow.next = slow.next.next;

            temp.next = null;

            // output head
            return dummy.next;

        }


/* Time Complexity = O(1) - does not depend on any variable apart from n which is an input, only pointers used
Space Complexity = O(1) */


}
