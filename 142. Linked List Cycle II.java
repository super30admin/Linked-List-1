public class Solution {
    // // Method 1 with HashSet
    // // Time complexity: O(n)
    // // Space complexity: O(n)
    // public ListNode detectCycle(ListNode head) {
    //     // null list
    //     if(head == null)
    //         return null;
    //     Set<ListNode> set = new HashSet<>();
    //     while(head != null){
    //         if(!set.contains(head)){
    //             set.add(head);
    //         }else{
    //             return head;
    //         }
    //         head = head.next;
    //     }
    //     return null;
    // }
    
    // Method 2 with two pointers
    // Time complexity: O(n)
    // Space complexity: O(1)
    public ListNode detectCycle(ListNode head){
        // null case
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        // here is used to detect whether the list has cycle
        // while(fast != null && fast.next != null){
        //     if(slow == fast){
        //         return slow;
        //     }
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        
         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // now we catch one cycle
                // for example, we use the example 1 as example
                // 3 -> 2 (start node of cycle) as A, the length of cycle is N, the distance from slow == fast to the start node is M
                // then slow_distance = A + B             
                // then, fast_distance = 2A + 2B
                // if slow == fast, then we could get formula: slow_distance + KN = fast_distance --> A + B + KN = 2A + 2B --> KN = A + B
                // now, we assume K == 1 --> A = N - B and M = N - B --> A == M, that means we could set another pointer (here we use head insdead) from head, and we move head and slow poniters as the same time, then they must arrive the start node at the same time.
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}


