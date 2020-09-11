//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//// Time Complexity :
//// Space Complexity :
//// Did this code successfully run on Leetcode :
//// Any problem you faced while coding this :

//// Your code here along with comments explaining your approach
var ListNode, list, list1, removeNthFromEnd;

ListNode = function(val, next = null) {
  return Object.assign(Object.create(ListNode.prototype), {
    val: val,
    next: next
  });
};

removeNthFromEnd = function(head, n) {
  var p1, p2, sentinel;
  sentinel = ListNode(-1, head);
  p1 = sentinel;
  p2 = sentinel;
  while (n > 0) {
    n -= 1;
    p2 = p2.next;
  }
  while (p2.next !== null) {
    p1 = p1.next;
    p2 = p2.next;
  }
  p1.next = p1.next.next;
  return sentinel.next;
};

list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))));

removeNthFromEnd(list, 1);

list1 = ListNode(1);

removeNthFromEnd(list1, 1);

//# sourceMappingURL=problem2-remove-nth-node-from-end.js.map
