/*

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
Using floyd's hare algorithm.
We first try to find the intersection of slow and fast pointer .
Here fast pointer goes twice as fast as slow pointer
When they meet. We move the slow pointer and the head pointer until they meet
that particular point is our answer.

*/




#include<iostream>
#include<vector>

using namespace std;

typedef struct ListNode{
    int val;
    ListNode* next;
    ListNode():val(0),next(nullptr){}
    ListNode(int x):val(x),next(nullptr){}
    ListNode(int x,ListNode* nxt):val(x),next(nxt){}
};

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == nullptr || head->next == nullptr ) return nullptr;
        ListNode* slow{head};
        ListNode* fast{head};
        ListNode* entry{head};
        while(fast && fast->next){
            fast = fast->next->next;
            slow = slow->next;
            if(slow == fast){
                while(slow!=entry){
                    slow = slow->next;
                    entry = entry->next;
                }
                return entry;
            }
        }
        return nullptr;
    }
};

