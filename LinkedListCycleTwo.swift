//
//  CyclicLinkedList.swift
//  DSA-Practice
//
//  Created by Paridhi Malviya on 1/15/26.
//

/*
 O(n)
 O(n)
 use hashset having the nodes especially the node address.
 Most of the linked list problems can be optimized with the extra space.
 
 Floyd's algorithm -
 take a slow pointer and a fast pointer.
 Move slow by 1x and fast by 2x
 check if they have met or not.
 
 If they didn't meet and fast goes out of the list. then it's not cyclic.
 think about the even and odd lenght linekd list.
 for even length -> fast != nil
 for odd length -> fast.next != nil
 
 In the first cycle -> the slow will be caught by fast one, no matter where slow and fast starts off. EVen if they are diagonally opposite, fast will be able to catch slow in the first cycle of slow.
 
 For 3x -> we can't guarantee that they will meet in optimal manner.
 
 How to figure out the head of the cycle ->
 The distance of the head of the linked list is  ->
 O(2n), no extra space - O(1)
 */

class CyclicLinkedList {
    init() {
        
    }
    
    func detectCycle(_ head: LLNode<Int>?) -> LLNode<Int>? {
        if (head?.next == nil) {
            return nil
        }
        
        var slow = head?.next
        var fast = head?.next?.next
        while(slow !== fast) {
            if (fast?.next == nil || fast?.next?.next == nil) {
                return nil
            }
            slow = slow?.next
            fast = fast?.next?.next
        }
        
        //slow and fast are meeting, so there is a cycle. now, iterate from head and the slow pointer, where both pointers meet, that would be the beginning of the cycle
        fast = head
        while (fast !== slow) {
            fast = fast?.next
            slow = slow?.next
        }
        return slow
    }
    
    
    func detectingTheHeadOfTheCycle() {
        
    }
}
