/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */

 //using recursion - TC: o(n) SC: o(n)
 var reverseList = function(head) {
    if (head == null || head.next == null) return head;
   var res = reverseList(head.next);
   head.next.next = head;
   head.next = null;
   return res;    
}


//Another approach s30 - slower - iterative approach
var reverseList = function(head) {
   if(head === null) return null;

   let prev = null;
   let curr = head;

   while(curr != null) {
       let temp = curr.next;
       curr.next = prev;
       prev = curr;
       curr = temp;
   }
   return prev;
}

