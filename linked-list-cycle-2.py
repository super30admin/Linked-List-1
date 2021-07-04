'''
Did it run leetcode: Yes
Problems faced: No
Time Complexity: 0(N)
Space Complexity: 0(1)

Algorithm:
- We run two pointers fast and slow
- the point where fast.next = slow is the point where cycle begins
- We again start a temp pointer from head to fast.next for node where cycle begins

'''



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        pos,cycle = -1,False
        slow,fast = head,head
        while fast and fast.next:
            fast,slow = fast.next.next,slow.next
            #print(fast==slow)
            if fast==slow:
                cycle=True
                break
                
        
        if cycle:
            temp = head
            pos=0
            while temp != fast.next:
                pos+=1
                temp=temp.next
        
        return temp if cycle else None