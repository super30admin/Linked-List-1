//Time Complexity:O(n)
//Space Complexity:O(1)
//running on leetcode: yes
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //base case,empty list return null
        if (head==null)
        {
            return null;
        }
    
    //slow and fast pointers to head
    ListNode slow = head;
    ListNode fast = head;
    //boolean variable whether cycle present or not
    boolean cycle = false;
    //find if cycle exist
    //traverse the linked list, move slow by 1 and fast by 2, until fast or fast,next = null
    while (fast != null && fast.next != null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast)
        {
            cycle = true;
            break;
        }
    }
    if (cycle == false)
    {
        return null;
    }
    //reset the haed pointer
    slow = head;
    while (slow != fast)
    {
        slow=slow.next;
        fast=fast.next;
    }
    return slow;


}
}
