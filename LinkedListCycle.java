public class LinkedListCycle {
    //Idea is to first identify cycle using slow pointer and fast pointer
    //If there is a cycle, both the pointers meet at some node. If not, there is no cycle and we return null
    //Once cycle is found, ,Slowpointer is moved to head and from there it takes equal number of steps for both 
    // slow pointer and fast pointer to reach the cycle head.

    // Time Complexity: O(n)
    // Space Complexity: O(1)
        public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slowpointer = head;
        ListNode fastpointer = head;

        boolean hasCycle = false;

        while(fastpointer.next!=null && fastpointer.next.next!=null)
        {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;

            if(slowpointer==fastpointer)
            {
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle) return null;

        slowpointer = head;
        while(slowpointer!=fastpointer){
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next;
        }
        return slowpointer;
    }
}
