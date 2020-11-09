#To reverse the linked list iteratively, as discussed iin class i used 3 pointers prev, curr, and next to manipulate the pointers accordingly to reverse the list
#Time Complexity: O(n)
#Space Complexity: O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def reverseList(self, head):
        prev = None
        curr = head
        while curr is not None:
            temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        return prev

    def printList(self,head):
        temp = head
        while temp is not None:
            print(temp.val)
            temp = temp.next




n1 = ListNode(4)
n2 = ListNode(3)
n3 = ListNode(2)
n4 = ListNode(1)
n1.next = n2
n2.next = n3
n3.next = n4
s= Solution()
pre = s.reverseList(n1)
s.printList(pre)