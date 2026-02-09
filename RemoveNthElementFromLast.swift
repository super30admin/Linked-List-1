//
//  RemoveElementFromLast.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/15/26.
//

/*
 Bruteforce - 2 pass algorithm -
 first push all elements in the stack. Then don'r pick the element at the nth position and pick other eleent and form the linked list
 
 approach2 - > 2 pass algorithm. move through the linked to count the no of elemtns.
 no of elements  - n-> pos
 now, traverse until the counter is pos. Then remove the next node.
 
 1 pass algorithm -
 use slow pointer, fast pointer - move th window until fast == nil. When fast =nil, at that moment, slow is at the position one step before the node I need to remove. I can remove the node.
 to remove the last element, maintain a dummy node at the start of the linked list.
 to remove the first node, dummy node will be useful. dummy.next = head of the linked list. 
 */

class RemoveNthNodeFromEnd {
    
    init() {
        
    }
    
    func removeNthFromEnd(_ head: ListNode?, _ n: Int) -> ListNode? {
        var count = 0
        let dummy = ListNode(-1)
        dummy.next = head
        var slow: ListNode? = dummy
        var fast: ListNode? = dummy
        while (count <= n) {
            fast = fast?.next
            count += 1
        }

        while (fast != nil) {
            fast = fast?.next
            slow = slow?.next
        }
        let temp = slow?.next
        slow?.next = slow?.next?.next
        temp?.next = nil
        return dummy.next

    }

}
