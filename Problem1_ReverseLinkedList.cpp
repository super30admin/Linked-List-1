
// Time Complexity : O(n) where n is no of elements in a linked list
// Space Complexity : O(1) we are not using extra space
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


#include<vector>
#include<bits/stdc++.h>
#include<stdlib.h>
#include<cmath>
#include<time.h>
#include<iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};


// Below is Iterative Solution


// class Solution {
// public:
//     ListNode* reverseList(ListNode* head) {
        
//         if(head==NULL || head->next ==  NULL) return head;
        
//         // ListNode* prev=new ListNode(NULL);
//         ListNode* prev=NULL;
//         ListNode* curr=head;
//         ListNode* fast=head->next;
//         // prev->next=curr;
        
//         while(fast != NULL){
//             curr->next=prev;
//             prev=curr;
//             curr=fast;
//             fast=curr->next;
//         }
        
//         curr->next=prev;
        
//         return curr;
        
//     }
// };


// below is Recursive Solution
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        if(head==NULL || head->next ==  NULL) return head;
        
        ListNode* reversed = reverseList(head->next);
        
        head->next->next = head;
        head->next = NULL;
        return reversed;
        
    }
};




int main(){

    


    Solution a;

    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);
    // head->next->next->next->next = newNode(5);

    // vector<int>  nums={0,0,1,1,1,1,2,3,3};
    //int target=5;
    ListNode* r = a.reverseList(head);
    // for (int x : nums) 
    //      cout << x << " "; 

    // cout<<endl;

    while(r!=NULL){
        cout<<r->val<<" ";
        if (r->next)
            cout << "-> ";
        r=r->next;
    }

    // can either do this below for answer in true false 
    // cout.setf(std::ios::boolalpha);
    // cout <<  b << endl;

    // or

    // cout <<  boolalpha << b << endl;

}