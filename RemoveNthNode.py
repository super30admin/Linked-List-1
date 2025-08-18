# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        fast = dummy
        slow = dummy
        count = 0
        if head == None or head.next == None:
            return None
        else:
            while count<=n:
                count+=1
                fast = fast.next
                
            while fast:
                slow = slow.next
                fast = fast.next
            
            temp = slow.next
            slow.next = slow.next.next
            temp.next = None

            return dummy.next


        
        