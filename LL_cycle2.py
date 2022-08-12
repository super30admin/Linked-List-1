# Time complexity : O(n)
# Space complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# IF FAST STARTS AT HEAD

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
#       None
        if(head == None):
            return None
#     initial flag set to False
        flag = False
        slow = head
        fast = head
#         checking whether there is any cycle or not
        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
        if not flag:
            return None
#         head of cycle
        slow = head
        while (slow != fast):
            slow = slow.next
            fast = fast.next
        return slow
            
                

# IF FAST STARTS AT HEAD.NEXT          

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head == None):
            return None
        flag = False
        slow = head
        fast = head.next

        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            
            if slow == fast:
                flag = True
                break
        if not flag:
            return None

        slow = head
        fast = fast.next
        while (slow != fast):
            slow = slow.next
            fast = fast.next
        return slow
            
                
