//
//  ReverseLinkedList.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/15/26.
//

/*
 reverse linked list -
 approach 1 -> store all nodes in stack and start unfolding the stack.
 use array. put elements in array and then traverse from the end.
 
 In linked list problem, we can avoid using extra space.
 
 
 using 3 pointers ->
 current, previous, next
 
 before you lose the connection with the node, store it in a temp variable.
 
 Approach 3 -> recursion. O(n) space - for recursion stack
 O(n) - time complexity
 
 */

public class ListNode {
     public var val: Int
    public var next: ListNode?
     public init() { self.val = 0; self.next = nil; }
    public init(_ val: Int) { self.val = val; self.next = nil; }
     public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
}

class ReverseLinkedList {
    
    func reverseList(_ head: LLNode<Int>?) -> LLNode<Int>? {
        if (head == nil || head?.next == nil) {
            return head
        }
        
        var current = head //ListNode?
        var prev: LLNode<Int>? //ListNode?
        var temp: LLNode<Int>?
        while(current != nil) {
            temp = current?.next
            current?.next = prev
            prev = current
            current = temp
        }
        return prev
    }
    
    var result: LLNode<Int>?
    func reverseListByRecursionUsingPointers(_ head: LLNode<Int>?) -> LLNode<Int>? {
        var prev: LLNode<Int>?
        reverse(head, prev: prev)
        return result
    }
    
    func reverse(_ current: LLNode<Int>?, prev: LLNode<Int>?) {
        var prev = prev
        var current = current
        if (current == nil) {
            result = prev
            return
        }
        
        let temp = current?.next
        current?.next = prev
        prev = current
        current = temp
        
        reverse(current, prev: prev)
    }
    
    //MARK: using in built recursion stack
    
    var newHead: LLNode<Int>?
    func reverseUsingRecursionStack(_ head: LLNode<Int>?) -> LLNode<Int>? {
        reverseRecursionStack(head)
        return result
    }
    
    func reverseRecursionStack(_ head: LLNode<Int>?) {
        if (head == nil || head?.next == nil) {
            newHead = head
            return
        }
        reverseRecursionStack(head?.next)
        head?.next?.next = head
        head?.next = nil
        return
    }
    
    //MARK: using in built stack, using Node return type
    func reverseListUsingNodeReturnType(_ head: ListNode?) -> ListNode? {
        return reverseUsingNodeReturnType(head)
    }

    //O(n) - time complexity, O(n)- recursion stack
    func reverseUsingNodeReturnType(_ head: ListNode?) -> ListNode? {
        if (head == nil || head?.next == nil) {
            return head
        }
        //result is not parameter of recursion, so it will remain constant. If stack unfolds, the head will change, but result will remain constant.
        let result = reverseUsingNodeReturnType(head?.next)
        head?.next?.next = head
        head?.next = nil
        return result
    }

    
}

