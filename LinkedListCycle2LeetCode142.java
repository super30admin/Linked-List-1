
//Time Complexity: O(n)
//Space Complexity : O(1)
//didn't face any problems
//runs successfully



public class LinkedListCycle2LeetCode142 {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
        public ListNode detectCycle(ListNode head) {

            ListNode slow = head;                       //creating 2 pointers, fast and slow
            ListNode fast = head;


            while(fast !=null && fast.next!=null){      //check is fast is not null and fast.next is not null

                slow = slow.next;                       //if so, then increment the slow pointer by 1
                fast = fast.next.next;                  //and fast pointer by 2

                if(slow == fast){                       //check fast and slow pointing the same node
                    break;                              //if so that means, there's a cycle present in the Linked List
                }
            }

            if(fast == null || fast.next == null){      //check our loop breaks because of the fast pointer reaches to the end or not
                return null;                            //if so, that means, linked list has not contain any cycle
            }

            //means linked list contain cycle and we need to identify that element, for that we need to start the slow pointer from head
            slow = head;
            while(slow!=fast){                  //check again start and fast pointer is equal or not
                slow = slow.next;               //if not then increment the slow and fast pointer by 1
                fast = fast.next;
            }
            return slow;                        //both the pointers meet at the node where cycle is begin

        }
}
