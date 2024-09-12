//Time Complexity : O(n)
//Space Complexity : O(1)
//Runs successfully on leetcode
//No Problem

//Here we will be having 2 pointers : slow and fast
//fast pointer will traverse at twice the speed of slow pointer
//If there's a cycle, these two pointers will meet at some point

//After we've detected a cycle, slow will again point at head
//We'll start traversing slow and fast at equal speed both coming at eachother
//the point of meeting will be starting of the cycle



public class Linked_List_1_Problem_3_Cycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }

        if(flag)
        {
            slow = head;
            while(slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
