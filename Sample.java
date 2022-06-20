//**CIRCULAR LINKEDLIST-2: BRUTEFORCE**
//Time complexity: o(n);
//Space complexity: o(n);
//Leetcode runnable: Y;
//Any doubts: N;

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        
        ListNode curr=head;
        
        while(curr!=null)
        {
            if(set.contains(curr))
            {
                return curr;
            }
            else
            {
                set.add(curr);
                curr=curr.next;
            }
        }
        return null;
        
    }
}


//****CIRCULAR LINKED LIST-2: OPTIMAL
// Time Complexity :O(N);
// Space Complexity :O(1);
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag=false;
        
        //null case
        if(head==null) return null;
        
        //Checking if the cycle exists
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        
        if(flag==false) return null;
        
        slow=head;
        if (flag)
        {
            while(slow!=fast)
            {
            slow=slow.next;
            fast=fast.next;
            }
            
        }
        return slow;
    }
}
// Your code here along with comments explaining your approach


//****REVERSE A LINKED LIST- ITERATIVE APPROACH****
//Time complexity:o(n);
//Space complexity:o(1);
//Leetcode runnable: Y;
//Any doubts: N;

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
class Solution {
    public ListNode reverseList(ListNode head) {
        //Null case
        if(head==null)
        {
            return null;
        }
        
        
        //We need to assign 3 variables
        ListNode curr=null;
        ListNode nextpt=head;
        ListNode fast=head.next;
        //show must go till fast!=null
        while(fast!=null)
        {
            nextpt.next=curr;
            curr=nextpt;
            nextpt=fast;fast=nextpt.next;
        }
        
        //lastly we need to join for the last node which is remained
        nextpt.next=curr;
        
        return nextpt;
        
        
    }
}
