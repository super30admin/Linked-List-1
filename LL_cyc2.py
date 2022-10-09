#time complexity:o(n), actually o(2n) bec we traverse twice
#space complexity: 0(1) no extra space used
#passed all cases on LeetCode: yes
#difficulty faced:-
# comments: in the code
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: 'Optional[ListNode]') -> 'Optional[ListNode]':

        if head == None: return None 
        slow = fast = head
        hascyc = False

        #this check is for even and odd lists when either fast  or fast.next can become null
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next 
            #if fast and slow meet somewhere then there is a cyc
            #this doesnt mean they met at 1st element of cyc so still have to find that
            if (slow == fast):
                hascyc = True
                break
            
        if (not hascyc): return None
        
        #remember that equation 2(a+c) = b+2c (something like this)
        

        #if we start fast ptr again from beginning it will meet slow ptr at start of cyc
        #this equation only works when fast travels twice as fast as slow 
        fast = head
        while fast != slow:
            print(fast.val)
            print(slow.val)
            fast = fast.next
            slow = slow.next

        return slow


