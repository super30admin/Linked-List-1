# Time Complexity : O(N)
# Space Complexity : O{1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Create 3 pointers copy =head,slow=head and fast= head
#while fast.next and fast.next.next is valid move fast pointer at twice the speed of the slow pointer
#If slow and fast meet then set the flag to true
#Now start moving the copy and slow pointer together until they meet


 def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        copy = head
        slow = head 
        fast = head
        flag = False
        if head is None :
            return None

        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                flag = True
                break
        if flag:
            while copy != slow:
                copy = copy.next
                slow = slow.next
            return slow
        return None