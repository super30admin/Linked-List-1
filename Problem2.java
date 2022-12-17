// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :edge cases and logic was a bit challenging
/*
We will use two pointers , slow and fast

we will move fast n+1 times

then we will move slow and fast 1 step until fast reached null, 

the slow would be pointing to the nth-1 node,we can use the pointer to delete that value
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //edge cases

        ListNode fast = head;
        int count = n+1; // move one step additional so that slow can point to node before nth

        while(count>0 && fast!=null){
            fast = fast.next;
            count--;
        }

        // we will move fast and slow one step at a times
        ListNode slow = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        // if count ==0, it means slow is pointing to a node before the nth
        if(count==0){
            slow.next = slow.next.next;
            return head;
        }
        // slow is pointing to the node to be deleted
        return slow.next;
    
    }
}