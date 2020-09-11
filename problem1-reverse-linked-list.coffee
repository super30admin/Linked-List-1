#https://leetcode.com/problems/reverse-linked-list/
#// Time Complexity : O(n) we visit just once
#// Space Complexity : O(1) 3 pointers
#// Did this code successfully run on Leetcode : yes
#// Any problem you faced while coding this :
#
# keeping the order of operations on pointers straight will be hard to remember
#//// Your code here along with comments explaining your approach
#
# initialize prev = null (this will be the tail of the reversed list)
# initialize curr = head
# initialize next = null (this will be set in the first step of the loop)

# for each element [0..length-1] (aka while curr != null)
#   advance next next = curr.next
#   add on to the prev list via current.next = prev, prev = current
#   advance current via current = next

# return prev (the list we were building up)

ListNode = (val, next = null) -> Object.assign(
  Object.create(ListNode::),
  val: val
  next: next
)

reverseList = (head) ->
  prev = null
  curr = head
  next = null

  while curr isnt null
    next = curr.next
    curr.next = prev
    prev = curr
    curr = next

  prev

list = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
reverseList(list)
