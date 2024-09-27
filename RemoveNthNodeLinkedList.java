// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        
        ListNode tmpNode = head;
        
        int len = 0, count=1;
        
        while(tmpNode!=null){
            tmpNode = tmpNode.next;
            len++;
        }
        tmpNode=head;
        if(n==len)
            return head.next;
        while(count!=(len-n)){
            tmpNode=tmpNode.next;
            count++;
        }
            tmpNode.next=tmpNode.next.next;
        
        return head;
                
        
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmpNode =new ListNode(0);
        tmpNode.next=head;
        n++;
        ListNode slow=tmpNode,fast=tmpNode;
        helper(slow, fast, n, tmpNode);
        return tmpNode.next;
        
    }
    public int helper(ListNode slow, ListNode fast, int n, ListNode tmpNode) {
        
        if(fast==null)
            return 0;
        
        int res = helper(slow.next, fast.next, n, tmpNode);
        
        if(res+1==n){
            
            fast.next=fast.next.next;
        }
        
        return res+1;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmpNode =new ListNode();
        tmpNode.next=head;
        
        ListNode slow=tmpNode,fast=tmpNode;
        
        while(fast!=null && n-->=0)
            fast=fast.next;
        
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        
        return tmpNode.next;
    }
}