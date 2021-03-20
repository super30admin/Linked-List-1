// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//Two -pointer approach
public class Solution {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        //base condition
        if(head==null) return null;
        
        // while(curr.next!=null){
        //     length+=1;
        //     curr=curr.next;
        // }
        
        //Using two-pointer approach, we will traverse fast double the speed of slow pointer and wherever they meet, we move our head pointer until head and slow are equal
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                while(head!=slow){
                    head= head.next;
                    slow=slow.next;
                }
                return head;//slow or head anything would work;
            }
        }
        return null;
    }
}
