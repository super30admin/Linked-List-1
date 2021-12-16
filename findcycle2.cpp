/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

//Time complexity : O(n)
//Space complexity : O(1)
//Leetcode : Yes
//Approach : 
            // Take a slow and a fast pointer
            // Increment fast by 2 nodes while slow by 1
            // Once they meet, reset slow to head
            // Move both the pointers by 1 node
            // Once they meet, return the pointer

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == nullptr)
            return nullptr;
        
        ListNode* slowPointer = head;
        ListNode* fastPointer = head;
        bool hasCycle = false;
        
        while(fastPointer != nullptr && fastPointer->next != nullptr)
        {
            slowPointer = slowPointer->next;
            fastPointer = fastPointer->next->next;
            
            if(fastPointer == slowPointer)
            {
              hasCycle = true;
              break;   
            }            
        }
        
        if(!hasCycle)
            return nullptr;
        
        slowPointer = head;
        
        while(slowPointer != fastPointer)
        {
            slowPointer = slowPointer->next;
            fastPointer = fastPointer->next;
        }
        
        return slowPointer;
    }
};