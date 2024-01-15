// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach
// Idea is to use two pointers and iterate fast pointer to nth node from start in the list. Then traverse
// two pointers adn then update slow pointer links when fast reaches the end and then return the updated list.

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        int count = 0;
        ListNode* fast = dummy;
        ListNode* slow = dummy;

        if(head == nullptr)
        {
            return nullptr;
        }

        while(count <= n)
        {
            fast = fast->next;
            count++;
        }

        while(fast != nullptr)
        {
            slow = slow->next;
            fast = fast->next;
        }
        slow->next = slow->next->next;

        return dummy->next;
    }
};