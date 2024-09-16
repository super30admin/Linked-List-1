/*

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 
Edge case if removing the first point of the linked list 
Also for removing the last index


// Your code here along with comments explaining your approach
Increment the fast pointer n times that of slow pointer initially as the difference between
the last linked list and the link to remove is constant.
So using this we are able to reach end of the list and also the node just before the one to be renmoved
Move the nextpointer of the curr node to the node next of one to be deleted.

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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int count{};
        ListNode* dummy = new ListNode(-1,head);
        ListNode* curr{dummy};
        ListNode* fast{dummy};
        while(count<n){
            fast = fast->next;
            count++;
        }
        while(fast!=nullptr && fast->next!= nullptr){
            fast = fast->next;
            curr = curr->next;
        }
        //cout<<curr->val;
        //cout<<fast->val;
        ListNode* temp = curr->next;
        curr->next = temp->next;
        temp->next = nullptr;
        //delete temp;
        return dummy->next;
    }
};