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
//Approach:
            // Keep three pointers previous which is initally set to null
                                // current which is initally set to head
                                // fast which is initally set to head->next
            // Update current->next = prev , prev = current , current = fast and fast = fast->next till fast reaches end of the list
            // Return current

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr)
            return nullptr;
        
        ListNode* prev = nullptr;
        ListNode* curr = head;
        ListNode* fast = head->next;
        
        while(fast != nullptr)
        {
            curr->next = prev;
            prev = curr;
            
            curr = fast;
            fast = fast->next;
        }
        
        curr->next = prev;
        
        return curr;
    }
};