# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

#Problem 1: Reverse linked list
#Time Complexity: O(n)
#Space Complexity: O(1)

'''
Brute force: Traverse the link list, save each element in an array,
reverse the array, recreate a linked list
'''
'''
Main idea:
Reverse the pointers at each paint while making sure that we don't loose track of the next point
by keeping a temp pointer. At the end of traversal each node will be pointing at the opposite direction,
we return the temp
'''
#!!THINK IN TERMS OF POINTERS, not the element it's pointing at
#mistake: temp=head.next at each iteration, if you don't change head, it will always point
#to same listnode every iteration (infinite loop)

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        #edge case
        if not head:
            return None
        present=head
        res=None
        while present:
            #Point to the next element in the present pointer
            temp=present.next
            present.next=res
            res=present
            present=temp

        return res


#Problem 2: Remove Nth Node From End of List
#Time complexity: O(n)
#space complexity: O(1)
#Worked on leetcode? yes
'''
Brute force:
One traversal to get the length of the linked list. Now that we know the position to remove,
we can just  re-traverse the linked list and when the next element is the one we want to remove
we just point the current one to the next next element
'''
'''
Main idea:Slow pointer that points to the first element and doesn't move
traverse until we reach the element n and put a fast pointer there, then start moving the
slow and fast pointer until fast is at the last element. That means the next element
after slow is the one we want to remove. Point its next to next next.
'''
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        #edge case
        if not head:
            return None
        if not head.next:
            return None
        slow=head
        fast=head
        count=0
        while count<n:
            fast=fast.next
            count+=1

        #important if fast went outside, we remove the first element
        #since we want the gap between fast and slow to be n
        if not fast:
            return head.next
        while fast.next:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return head



#Problem3: Linked List Cycle II
#Time Complexity: 0(n)
#Space Complexity: O(1)

'''
Brute force:
Keep a hashmap  with elements being a pointer to each node and
value the index.if we encouter the same pointer, return the index. Return -1
If we've gone throught he whole list.
'''
'''
We want to keep track of the position where we've been through
so that we know when we came back. We notice that the actual value
of the nodes are irrelevant. We can just traverse the through the array
transform the vals to None as we pass by. If we encounter a None value, it means
we've done a cycle. No transform this value to 1. We retraverse the array from
start while keeping a count and get the position of the only non None value.
Do not confuse None val and the actual object being None
'''

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if not head:
            return None
        temp=head
        while temp:
            #Check if we can finish the array (means no loops)
            if temp.next == None:
                return None
            #check the value, if we encounter None val
            #it means we've gone through the cycle, we
            #identify the node
            if temp.val==None:
                temp.val=1
                break
            temp.val=None
            temp=temp.next

        count=0
        temp=head
        while temp.val!=1:
            count+=1
            temp=temp.next
        return temp
