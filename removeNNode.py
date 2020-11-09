#To remove the nth node from list, I created an extra node and added it to start of list, then calculated list and subtracted n from it, then I traversed the list from extra node to length and removed the node at current length location.
#Time Complexity: O(n)
#Space Complexity: O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeNode(self, head,n):
        temp = head
        length = 0
        while (temp is not None):
            length = length + 1
            temp = temp.next
        extraNode = ListNode(0)
        extraNode.next = head
        length = length - n
        temp  = extraNode
        while (length > 0):
            length = length - 1
            temp = temp.next
        temp.next = temp.next.next
        return extraNode.next
        
    def printList(self,head):
        temp = head
        while temp is not None:
            print(temp.val)
            temp = temp.next




n1 = ListNode(1)
n2 = ListNode(2)
n3 = ListNode(3)
n4 = ListNode(444)
n5 = ListNode(5)
n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n5
s= Solution()
head = s.removeNode(n1,2)
s.printList(head)