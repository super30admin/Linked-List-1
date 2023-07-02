//Time Complexity: O(n)
// Space Complexity: O(1); 

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
        if(head == nullptr || head->next == nullptr) return head; 
        ListNode* prev; 
        ListNode* curr;
        ListNode* nextptr; 
        prev = nullptr; 
        curr = head; 
        nextptr = head->next; 

        while(curr != nullptr) {
            curr->next = prev; 
            prev = curr; 
            curr = nextptr; 
            if(nextptr != nullptr) nextptr = nextptr->next; 
        }

        return prev;     
    }
};