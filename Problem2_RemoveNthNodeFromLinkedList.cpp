
// Time Complexity : O(n) because we have only one element to delete
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
        
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        
        ListNode* slow = dummy;
        ListNode* fast = dummy;
        
        int count = 0;
        
        while(count<=n){
            fast=fast->next;
            count+=1;
        }
        
        while(fast != NULL){
            slow = slow->next;
            fast= fast->next;
        }
        
        slow->next = slow->next->next;
        
        return dummy->next;
           
        
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
    int k =2;
    ListNode* r= a.removeNthFromEnd(head,k);
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