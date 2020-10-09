/** Algoritm : Recursion

recursive (progression, data, ans). 
we can ignore ans an this happens in-place
progression and data can be combined in LL as node

recursion(node/node.next){
//Base Case
if(node == null || node.next == null) return node;

p = recursion(node)
node.next.next = node;
node.next = nu;;l
return p;
}

TC : O(n)
SC : O(n)

**/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        
        //Base Case
        if(head == null || head.next == null)
            return head;
        
        //Logic
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
        
    }
}