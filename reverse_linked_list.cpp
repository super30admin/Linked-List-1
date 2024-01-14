// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Idea here is recursively change the links to the previous node.

//Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* reversed;
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr)
        {
            return nullptr;
        }
        reversed = helper(head);  
        return reversed;
    }

    ListNode* helper(ListNode* head)
    {
        if(head->next == nullptr)
        {
            return head;
        }

        reversed = helper(head->next);
        head->next->next = head;
        head->next = nullptr;

        return reversed;


    }
};