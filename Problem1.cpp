// Time Complexity : O(N) N is size of LL
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Take 2 pointers current=head and previous=NULL.
// 2. Store current's next in temp and change it to previous.
// 3. Now previous will be current pointer and current(=temp) will traverse further till NULL.



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
    ListNode* nhead=nullptr;
    ListNode* recursivere(ListNode* t){
        if( t->next==nullptr){
            nhead=t;
            return t;
        }
        cout<<(t->val)<<'\n';
        ListNode* prev=(recursivere(t->next));
        (prev->next)=t;
        return t;
    }
    ListNode* reverseList(ListNode* head) {
        if(head==nullptr || head->next== nullptr){
            return head;
        }
        (recursivere(head)->next)=nullptr;
        return nhead;
    }
};