// Time Complexity :  O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english

/* Use Slow and fast pointers. Move the fast pointer two nodes at a time and slow pointer one node at a time till fast and slow becomes same or
 * fast becomes null.
 * If fast and slow does not meet then there is no cycle, return null.
 * Else reset slow to head and now move both slow and fast pointers one node at a time. Return the node where both fast and slow meet.
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
        if (head == nullptr)
            return nullptr;
        
        ListNode* slow = head;
        ListNode* fast = head;
        bool isCycle = false;
        
        // For odd and even number of nodes list.
        while (fast != nullptr && fast->next != nullptr)
        {
            slow = slow->next;
            fast = fast->next->next;
            
            if (slow == fast)
            {
                isCycle = true;
                break;
            }
        }
        
        if (!isCycle)
            return nullptr;
        
        slow = head;
        while (fast != slow)
        {
            fast = fast->next;
            slow = slow->next;
        }
        
        return fast;
    }
};