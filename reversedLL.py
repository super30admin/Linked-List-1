"""
Reverse a singly linked list.


Successfully excecuted on leetcode


Approach --
1. Save the current node's next in to temp
2. Save previous node as curr node's next
3. Now set previous node as current and temp as current
"""
class Reverse:
    def reverseList(self, head: ListNode) -> ListNode:
        
        #1. Recursion : time - O(n), space = O(n); where n = num of nodes
        if not head or not head.next:
            return head
        p = self.reverseList(head.next)
        head.next.next = head
        head.next = None
        return p
                
        
        #2. Iterative approach, time = O(n), space = O(1); where n = num of nodes
        prev = None
        curr = head
        while curr:
            nextTemp = curr.next
            print("nextTemp :", nextTemp)
            curr.next = prev
            print("curr next :", curr.next)
            prev = curr
            print("prev : ", prev)
            curr = nextTemp
            print("curr : ", curr)
        print("PREV HERE : ", prev)
        return prev