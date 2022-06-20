# time complexity is o(n), where n is the size of the input
# sapce complexity is o(1).
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(not head or not head.next):
            return head    
        prev = None
        curr = head
        fast = head.next
        while(fast):
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next
        curr.next = prev
        return curr

# time complexity is o(n), where n is the size of the input
# sapce complexity is o(n), where n is the size of the input.(Recursive stack space)

# version 1

        # if(head is None or head.next == None):
        #     return head
        # rev = self.reverseList(head.next)
        # head.next.next = head
        # head.next = None
        # return rev

# version 2
    #     if(head is None or head.next == None):
    #         return head
    #     res = self.rev(head)
    #     head.next = None
    #     return res
    # def rev(self, head):
    #     if(head is None or head.next == None):
    #         return head
    #     res = self.rev(head.next)
    #     head.next.next = head
    #     return res
        
     
 #         prev = None
#         if(head==None):
#             return head
#         while(head):
#             curr = head
#             head = head.next
#             curr.next = prev
#             prev = curr

#         return prev
        
        
#         root= lroot = head 
#         l = list()
#         # if(head == []):
            
#         while(root):
#             l.append(root.val)
#             root = root.next
#         while(lroot):
#             lroot.val = l.pop()
#             lroot = lroot.next
#         return head


            