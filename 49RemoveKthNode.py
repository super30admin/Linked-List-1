"""
// Time Complexity :O(n) for traversing till the end of the list
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Added length in constructor.
This sconstructor is not compatible with LC class ListNode
// Any problem you faced while coding this : NA

//Explanation:
Keep the track of length of the linked list.
Iterate through the linked list (from head and towards end of LL) and check if length-i ==k
Then delete the node at that index location.

Example ->
length = 10 k = 4
When i=6,10 - 6 = 4.Delete node at k = 4.
"""
# Solution 1
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        fast = slow = head
        count = 1

        # move fast pointer ahead of slow pointer by n.
        while count <= n:
            fast = fast.next
            count += 1

        #remove the head node
        if fast is None:
                # edge case where LL contains only one node and that node is removed
                if slow.next is None:
                    return None
                else:
                    slow.val = slow.next.val
                    slow.next = slow.next.next
                return head

        # move fast and slow till the fast = last node and slow= node before nth
        #node(node before node to remove)
        while fast.next is not None:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return head


"""
# Solution 2
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None
        self.length = 1

    def insert(self,value):
      newNode = LinkedList(value)
      current = self
      while current.next is not None:
        current = current.next
      current.next =  newNode
      self.length += 1

    def removeKthNodeFromEnd(head, k):
      current = head
      previousNode = current
      for i in range(0,head.length):
        if head.length - k == 0:
          head.value = head.next.value
          head.next = head.next.next
          head.length -= 1
          break
        elif head.length - i == k:
          previousNode.next = current.next
          head.length -= 1
        previousNode = current
        current = current.next

    def printLL(self):
      current = self
      LL = []
      while current:
        LL.append(current.value)
        current = current.next
      return LL

if __name__ == "__main__":
  ll = LinkedList(0)
  ll.insert(1)
  ll.insert(2)
  ll.insert(3)
  ll.insert(4)
  ll.insert(5)
  ll.insert(6)
  ll.insert(7)
  ll.insert(8)
  ll.insert(9)
  ll.printLL()
  print("LL length =",ll.length)
  print(ll.printLL(),",LL length =",ll.length)
  ll.removeKthNodeFromEnd(4)
  print(ll.printLL(),",LL length =",ll.length)
  ll.removeKthNodeFromEnd(9)
  print(ll.printLL(),",LL length =",ll.length)
"""
