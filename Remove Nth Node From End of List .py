# time complexity is o(n), where n is the size of the input
# sapce complexity is o(1).
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        prev = TreeNode(0)
        prev.next = head
        slow = prev
        fast = prev
        while(n > 0):
            fast = fast.next
            n -= 1
        while(fast.next != None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return prev.next
        
#         l = 0
#         temp = head
#         while(temp!=None):
#             l += 1
#             temp = temp.next
#         if(l==1):
#             rtemp = head
#             head = None
#             del(rtemp)
#             return head
#         i=1
#         k = l-n
#         root = head
#         if(k==0):
#             ktemp = head
#             head = head.next
#             ktemp.next = None
#             del(ktemp)
#             return head
#         while(i<k):
#             i += 1
#             root = root.next
#         if(root.next.next == None):
#             ntemp = root.next
#             root.next = None
#             del(ntemp)
#             return head
#         else:
#             ttemp = root.next
#             root.next = root.next.next
#             ttemp.next = None
#             del(ttemp)
#             return head
            
        

        