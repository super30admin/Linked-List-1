# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    ###also insert dummunodee
    """
    Till count is less than equal to n we me the fast pointer
    then we just move both the pointers and point will come when
    fast points to null as soon as it happens the pointer pointing to slow.next has to be removed we just do slow.next=slow.next.next and the
    element is removed

    """

    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        """optimal one pass below"""
        ###dummy->head(a)-> b>c->d
        ##add dummynode
        dummy = ListNode(-1)
        ###point dummy to head
        dummy.next = head
        ###introduce slow and fast pointers
        slow = dummy
        fast = dummy
        count = 0
        while count <= n:
            ###move fast pointer only to get a window of size n
            fast = fast.next
            count += 1
        ###now move both pointers at 1x speed
        while fast != None:
            slow = slow.next
            fast = fast.next
        ## when fast points to null element pointing to slow.next should be removed so
        slow.next = slow.next.next

        ##here we have to return dummy.next instead of head.next
        return dummy.next

        """
        brute force put it in a separte list and remove the element
        """
#         array=[]
#         currentnode=head
#         while currentnode!=None:
#             array.append(currentnode.val)
#             currentnode=currentnode.next
#         k=len(array)
#         array.pop(k-n)
#         print(array)

#         for arr in array:
#             node=ListNode(arr)
#             node=node.next
#             # if node==None:
#             #     return node

#         return node


# return array


