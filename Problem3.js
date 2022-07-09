// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 var detectCycle = function(head) {
    if(!head) return null;
   const set = new Set();
    while(head){
        if(set.has(head)){
            return head;
        }
        else{
            set.add(head);
            head = head.next;
        }
    }
    return null;
};