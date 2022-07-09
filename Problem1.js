// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
* @param {ListNode} head
* @return {ListNode}
*/
var reverseList = function(head) {
   let temp = null;
   while(head){
       let next = head.next;
       head.next = temp;
       temp = head;
       head = next;
   }
   return temp;
};