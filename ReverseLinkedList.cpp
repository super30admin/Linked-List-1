// Time Complexity :  O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english

/* Maintain three pointer prev, curr, next.
 * Keep reversing the links between prev and current till fast becomes null. 
 */


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
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == nullptr || head->next == nullptr)
            return head;
        
        ListNode* prev = nullptr;
        ListNode* cur = head;
        ListNode* fast = head->next;
        
        while (fast != nullptr)
        {
            cur->next = prev;
            prev = cur;
            cur = fast;
            fast = fast->next;
        }
        cur->next = prev;
        
        return cur;
    }
};