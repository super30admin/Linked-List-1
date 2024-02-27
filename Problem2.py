# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
      # # O(N) / O(N)
      # arr = []
      # while head:
      #   arr.append(head)
      #   head = head.next
      # del arr[len(arr) - n]
      # if len(arr) == 0:
      #   return None

      # res = arr[0]
      # curr = res
      # for i in range(1, len(arr)):
      #   curr.next = arr[i]
      #   curr = curr.next
      # curr.next = None
      # return res

      # keep nth pointer back
      if not head:
        return
      toRemove = None
      count = n + 1
      curr = head
      while curr:
        count -= 1
        if count < 1:
          toRemove = curr
          count = n + 1
        curr = curr.next
      
      if not toRemove:
        return None
      if toRemove == head:
        head.next = None
        return head

      if toRemove.next and toRemove.next.next:
        toRemove.next = toRemove.next.next
      else:
        toRemove.next = None

      return head

        




      


        
