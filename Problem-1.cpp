/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 Time Complexity = O(N)
 Space Complexity = O(1)
 Where N is the number of nodes in the linked list.
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* head1 = new ListNode(0);
        ListNode* prev = NULL;
        ListNode* curr = head;
        ListNode* next = NULL;
        while(curr!=NULL)
        {
            next=curr->next;
            curr->next = prev;
            prev = curr;
            curr=next;
        }
        head1 = prev;
        return head1;
    }
};
