#time complexity: O(n)
#space complexity: O(1)
#ran on leetcode: Yes
#have three pointerrs, prev, curr and nxt. Make the curr.nxt to point to previous which reverses the current nodes next. Now the previous node comes to current node, current node goes to next node and next node goes to the 4th node. This keeps on repeating till curret ahs become null, at whuch point previous will be the head of reversed linked list.
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        curr=head
        if(head==None):
            return head
        prev=None
        nxt=curr.next
        while(True):
            curr.next=prev
            prev=curr
            curr=nxt
            if(curr==None):
                break
            nxt=nxt.next
        print(prev.val)
        head=prev
        return head

        
