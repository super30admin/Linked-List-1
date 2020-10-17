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

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        ListNode* prev = NULL;
        ListNode* curr = head;
        ListNode* after = NULL;
        while(curr != NULL)
        {
            after = curr->next;
            curr->next = prev;
            prev = curr;
            curr = after;
        }
        
        return prev;
        
    }
};