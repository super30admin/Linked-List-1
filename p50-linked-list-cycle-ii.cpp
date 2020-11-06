
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

// Using HashSet to store ListNodes
// Time complexity is O(n) - n = #elements in linked list
// Space complexity is O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        set<ListNode*> set;
        while(head != nullptr) {
            if(set.find(head) == set.end()) {
                set.insert(head);
                head = head->next;
            }
            else {
                return head;
            }
        }
        return nullptr;
    }
        
};

// Two pinters - slow and fast pointers
// Time complexity is O(n)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *slow = head;
        ListNode *fast = head;
        bool flag = false;
        while(fast && fast->next) {
            slow = slow->next;
            fast = fast->next->next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(!flag) return nullptr;
        slow = head;
        while(slow != fast) {
            slow = slow->next;
            fast = fast->next;
        }
        return slow;
    }
};
