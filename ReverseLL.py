# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        """Solution using three pointers 
        Time complexity-O(n)
        Space Complexity-O(1) as we are not using any extra space"""
        prev=None
        if not head or not head.next:
            return head
        slow=head
        fast=head.next
        while fast:
            slow.next=prev
            prev=slow
            slow=fast
            fast=fast.next
        slow.next=prev
        return slow
        
        """Time complexity-O(n)
        Space Complexity-O(n) as using array to reverse the nodes"""
        # arr=[]
        # if not head or not head.next:
        #     return head
        # ll=head
        # while ll:
        #     arr.append(ll)
        #     ll=ll.next
        # arr.reverse()
        # list1=ListNode(arr[0].val)
        # listcopy=list1
        # for i in range(1, len(arr)):
        #     li=ListNode(arr[i].val)
        #     # print(li)
        #     listcopy.next=li
        #     listcopy=listcopy.next
        #     # print(list1)
        # return list1
        # return list1