## Approach 1

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        dummy= ListNode(-1)

        dummy.next = head

        slow = dummy

        fast = dummy

        count = 0

        while(count<=n):
            print("hi")
            fast = fast.next
            count+=1


        while(fast!=None):
            slow = slow.next
            fast = fast.next

        temp = slow.next
        slow.next = slow.next.next
        temp = None

        return dummy.next



## Approach 2

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        temp = head
        count=0

        while(temp!=None):
            temp=temp.next
            count+=1

        temp = head
        curr= ListNode()
        prev = ListNode()
        flag = False

        while(count>n and count>0 and temp!=None):
            flag = True
            prev= temp
            temp= temp.next
            count-=1

        prev.next = None if temp is None else temp.next

        if not (flag):
            return prev.next


        return head



