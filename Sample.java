//Reverse LL using Iterative Soln

// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach
// Used 3 pointers such as prev,curr and fast pointer.. moved them step by step and assigned each node to the reverse node i.e. curr.next = prev;
//			prev = curr;
//			curr = fast;
//			fast = fast.next;

/////////////////////////////////////////////////////

//Reverse LL using recursive Soln

// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

// Your code here along with comments explaining your approach
// Here I just used reverseListRec as recursive method which internally uses recursive stack to pop the elements and assigns the node by using head.next.next = head;
//head.next = null

///////////////

//Linked List to detect cycle
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

//Your code here along with comments explaining your approach
// I used two pointers such as slow and fast 
// in which slow moves by 1x speed and fast moves by 2x speed
//at some node both will meet each other and I will flag the boolean value as true
//to return the position I will just move slow and fast pointer by 1x speed bcoz it will be the same distance travelled and when slow == fast I will return fast/slow 
//while (fast != null && fast.next != null) {
//			slow = slow.next;
//			fast = fast.next.next;
//			if (slow == fast) {
//				detectCycle = true;
//				break;
//			}
//
//		}

//To return pos
//while (slow != fast) {
//			slow = slow.next;
//			fast = fast.next;
//		}

//////////////////

//Remove Nth node
// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

//Your code here along with comments explaining your approach

//I used here dummy node conecpt just bcoz if there is only node to remove 
//I will make fast pointer to move until pos and increment the count..
//while (count <= n) {
//			fast = fast.next;
//			count++;
//		}

//after incrementing the count then it will be come out of while loop then I will 
//start moving slow and fast poiner by 1xspeed then we wil get window to assign the slow pointer to last value of node then nth node will be removed.
//while (fast != null) {
//			slow = slow.next;
//			fast = fast.next;
//		}
//		slow.next = slow.next.next;
