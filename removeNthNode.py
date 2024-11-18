# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this : returned "head" instead of "dummy.next"


# // Your code here along with comments explaining your approach

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1)                                       #init a dummy node before the head node
        dummy.next = head

        fast = dummy                                    # reaches end first
        slow = dummy                                    # starts when fast has travelled n times              
                                                   
        
        #logic
        count = 0

        while count <= n:                               # loop to find where to initialise slow loop
            fast = fast.next
            count +=1

        while fast!= None:                              # slow starts and stops when fast reaches the end
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next                      # remove4: 3->4->5 ... 3->5

        return dummy.next