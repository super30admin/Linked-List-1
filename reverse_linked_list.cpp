//Time Complexity-O(n)
//Space Complexity-O(1)
//Ran successfully on leetcode

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
 //Recursively
/*class Solution {
public:
    ListNode* reverseList(ListNode* head) {
       if(head==NULL || head->next==NULL)
           return head;
        ListNode*R=reverseList(head->next);
        head->next->next=head;
        head->next=NULL;
        return R;
    }
};*/
//Iteratively
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
       if(head==NULL)
           return NULL;
        ListNode*prev=NULL;
        ListNode*curr=head;
        ListNode*fast=head->next;
        while(fast!=NULL)
        {
            curr->next=prev;
            prev=curr;
            curr=fast;
            fast=fast->next;
        }
        curr->next=prev;
        return curr;
    }
};