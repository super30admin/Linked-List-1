#142. Linked List Cycle II
#Time Complexity : O(n) 
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#intialize fast , slow to head. Keep incrementing fast by 2 nodes and slow by  node. Then iterate it through a while loop untill slow = fast , set the flag . Once we come of the loop we will check if flag is true. If not return null. Else We again assign slow to head and keep incrementing slow and fast by 1 node untill slow - fast. Then finally return slow .
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow = head
        fast = head
        flag = False
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                flag = True
                break
        if flag == False:
            return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow