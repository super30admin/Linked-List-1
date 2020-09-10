//Time Complexity: O(n)
//Space Complexity: O(n) - worst case expecting there is no cycle
//Did it run on leetcode: yes
//Problems faced any: No

import java.util.HashSet;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        //create a hashset and keep track of all nodes
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr  = head;
        while(curr!=null){
            //if any node is repeating it means there is a cycle
            if(set.contains(curr))
                return curr;
            else
                set.add(curr);
            curr = curr.next;
        }

        return null;
    }
}
