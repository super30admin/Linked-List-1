//time complexity: O(n) we are going to traverse the entire set of nodes
//space complexity: O(1)
//executed on leetcode: yes
//approach: 1.we intitate two pointers at head and move slow pointer by 1 place and fast pointer by 2 places. 
// 2. if there is a cycle, slow and fast pointers will meet at some point, if not we return null node
//3. after tow pointers meet, we set slow pointer at head again and move both slow and fast pointers by one place, next time they meet is at the node where cycle begins

public class linkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = slow;
        boolean cycle = false;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) 
            {cycle=true;
             break;
        }
        }
        if(cycle==false) return null;
        slow = head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}