#https://leetcode.com/problems/remove-nth-node-from-end-of-list/
#// Time Complexity :
#// Space Complexity :
#// Did this code successfully run on Leetcode :
#// Any problem you faced while coding this :
#
#
#// Your code here along with comments explaining your approach

ListNode = (val, next = null) -> Object.assign(
  Object.create(ListNode::),
  val: val
  next: next
)

removeNthFromEnd = (head, n) ->
  sentinel = ListNode(-1, head)
  p1 = sentinel
  p2 = sentinel

  while n > 0
    n -= 1
    p2 = p2.next

  while p2.next isnt null
    p1 = p1.next
    p2 = p2.next

  p1.next = p1.next.next

  sentinel.next

list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
removeNthFromEnd(list, 1)
list1 = ListNode(1)
removeNthFromEnd(list1, 1)
