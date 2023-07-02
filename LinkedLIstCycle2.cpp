// Time Complexity: O(n)
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode* slow = head; 
        ListNode* fast = head; 
        bool isCycle = false; 

        if(head == nullptr) return {};

        while(!isCycle && fast->next != nullptr && fast->next->next != nullptr) {
            fast = fast->next->next; 
            slow = slow->next; 
            if(slow == fast) isCycle = true; 
        }

        if(isCycle) {
            slow = head; 
            while(slow != fast) {
                slow = slow->next; 
                fast = fast->next; 
            }
            return slow; 
        }

        return nullptr;                 
    }
};