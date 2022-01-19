# TC: O(N)
# SC: O(1)
# LC: YES
#PROBLEM: NO

from typing import Optional, List


class ListNode:
    def __init__(self, val=0, next=None) -> None:
        self.val = val
        self.next = next

class LinkedList:
    def __init__(self) -> ListNode:
        self.head = None
    
    def append(self,data: int) -> None:
        newNode = ListNode(data)
        if self.head == None:
            self.head = newNode
            return
        current = self.head
        while current.next != None:
            current = current.next
        current.next = newNode
        return 
    
    def newList(self, data: List[int]) -> ListNode:
        for item in data:
            self.append(item)
        return self.head

    def readList(self, head: ListNode) -> List[ListNode]:
        res =  []
        curr = head
        while curr.next != None:
            res.append(curr.data)
            curr = curr.next
        return res
        

class Solution: 
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        # counter, slow, fast = 0, None, None # sliding window
        # while (counter <= n if head.next.next != None else counter < n):
        #     fast = head if fast == None else fast.next
        #     counter += 1
        # while fast.next != None:
        #     fast = fast.next
        #     slow = head if slow == None else slow.next
        # slow.next = slow.next.next
        dummyNode = ListNode(-1)
        dummyNode.next = head
        counter = 0
        fast, slow = dummyNode, dummyNode
        while(counter < n):
            fast = fast.next
            counter += 1
        while(fast.next != None):
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummyNode.next
                    
sol = Solution()
myLL = LinkedList()
myInput = [1,2]
n = 1
print(sol.removeNthFromEnd(myLL.newList(myInput), n))