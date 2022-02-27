
//Time Complexity : O(n) n = size of linked list
// Space Complexity : O(1)
//didn't face any problems
//runs successfully



public class RemoveNthNodeFromEndOfList19LeetCode {


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
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode();
            dummy.next = head;                              //create a dummy node point to head

            ListNode slow = dummy;                          //create slow and fast pointer and they are pointing to dummy node
            ListNode fast = dummy;

            int i=1;                                        //creating i variable and set value to 1

            //because we are creating the dummy variable and we need to stop just before the removing node, first we need to maintain a gap between fast and slow pointer to n+1
            while(i<=n+1){
                fast = fast.next;
                i++;
            }

            //after maintaing a gap, iterating both counter and we have to iterate till fast pointer reaches to the end, by doing it, slow pointer will point just before the removing node
            while(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;                     //removing a node
            return dummy.next;                              //returning the head
        }
}
