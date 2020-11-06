// Time complexity is O(n) - n = #elements in linked list
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
    
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

// Two pass solution
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* node = head;
        int count = 0;
        while(node != nullptr) {
            count++;
            node = node->next;
        }
        count -= n;
        if(count == 0) return head->next;
        node = head;
        while(count-- != 1) {
            node = node->next;
        }
        node->next = node->next->next;
        return head;
    }
};

// One pass solution
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* slow = head;
        ListNode* fast = head;
        while(n-- != 0) {
            fast = fast->next;
        }
        if(!fast) return head->next;
        while(fast->next) {
            slow = slow->next;
            fast = fast->next;
        }
        slow->next = slow->next->next;
        return head;
    }
};
