// Time Complexity : O(N) N is size of LL
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Take 2 pointers fast=head and slow=head. Traverse LL with fast.
// 2. Slow will not start traversing untill there gap become (n-1).
// 3. Traverse till last node and slow pointers next.

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* s=head;
        ListNode* prev=nullptr;
        ListNode* f=head;
        int c=n;
        while((f->next)!=nullptr){
            c--;  
            if(c>0){
                f=f->next;
                continue;
            }   
            prev=s;  
            s=s->next;
            f=f->next;
        }
        // if(c==0){
        //     head = nullptr; return head;
        // }
        // if(n == 1){
        //     s->next = nullptr;return head;
        // }
        // if(s==head){
        //     head=(head->next);return head;
        // }
        
        if(prev==nullptr){
            head=head->next;return head;
        }
        cout<<(prev->val);
        (prev->next)=(s->next);
        return head;
    }
};