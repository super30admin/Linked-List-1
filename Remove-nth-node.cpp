/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

//Time complexity : O(n)
//Space complexity : O(1)
//Leetcode : Yes
//Approach :
            // Use slow and fast pointer approach
            // Move fast pointer by N
            // Once moved, start moving fast pointer until it reaches end node
            // Also update slow pointer to next node
            // Delete next node of slow pointer
            // return head

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == nullptr)
            return nullptr;
        
        ListNode* dummy = new ListNode();
        dummy->next = head;
        
        ListNode* slowPointer = dummy;
        ListNode* fastPointer = dummy;
        
        while(n > 0)
        {
            fastPointer = fastPointer->next;
            n--;
        }
        
        while(fastPointer != nullptr && fastPointer->next != nullptr)
        {
            slowPointer = slowPointer->next;
            fastPointer = fastPointer->next;
        }
        
        slowPointer->next = slowPointer->next->next;
        
        return dummy->next;
    }
};