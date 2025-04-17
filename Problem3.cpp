// Time Complexity : O(N) N is size of LL
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Take 2 pointers fast=head and slow=head. Traverse fast with double nodes and slow with single.
// 2. When fast equals slow move fast pointer to head of list and now traverse LL with same speed(regular traversal).
// 3. When both pointers meet again it will be our start node of cycle.


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
        ListNode *slow=head;
        ListNode *fast=head;
        bool f=1;
        while(f || slow!=fast){
            if(fast==nullptr || fast->next==nullptr){
                return nullptr;
            }
            slow=slow->next;
            fast=(fast->next->next);f=0;
        }

        while(head!=slow){
            slow=slow->next;
            head=head->next;
        }
        return slow;
    }
};