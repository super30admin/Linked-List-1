class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        
        len_list = 0
        
        curr = result = head
        while head:
            len_list += 1
            head = head.next
        
        if len_list == 1:
            return None
        
        if len_list == n:
            return curr.next
            
        remove_index = len_list - n -1
        index = 0
        
        while curr:
            if index == remove_index:
                break
            index += 1
            curr = curr.next
            
        curr.next = curr.next.next
        return result
    
    # Time Complexity: O(n)
    # Space Complexity: O(1)
    # This is a two pass solution

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # dummy = ListNode(0)
        # dummy.next= head
        slow = head
        fast = head
        curr = head
        
        for i in range(n):
            fast = fast.next
        
        if not fast: # Condition where n is equal to length of the LL
            return curr.next
        
        while fast.next != None:
            slow = slow.next
            fast = fast.next
            
        slow.next = slow.next.next
        
        return curr
    
    # One pass solution using floyd algorithm
    # Time Complexity: O(n)
    # Space Complexity: O(1)