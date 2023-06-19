// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes


#include <iostream>
  
using namespace std; 

struct ListNode{
        int data;
        ListNode *next;

        ListNode(int val){
            data = val;
            next = nullptr;
        }
};

//using three pointers prev, curr and fast
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if(head == nullptr || head->next == nullptr) return head;
        ListNode* prev = nullptr;
        ListNode* curr = head;
        ListNode* fast = head->next;

        while(fast != nullptr){
            curr->next = prev;
            prev = curr;
            curr = fast;
            fast = fast->next;
        }
        curr->next = prev;

        return curr;
    }
};