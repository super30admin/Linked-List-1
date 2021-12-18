// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// 3 pointer approach:
var reverseList = function (head) {
  if (head === null || head.next === null) {
    return head;
  }

  let prev = null;
  let current = head;
  let fast = head.next;
  // we could have also set the exit condition to become fast !== null.
  // then we wouldn't have to check if current is null in the while loop. However,
  // we would then have to set current.next to prev and then return current.
  while (current !== null) {
    current.next = prev;
    prev = current;
    current = fast;
    if (current !== null) {
      fast = fast.next;
    }
  }
  return prev;
};

// Reverse list by updating node values
// TC: O(n)
// SC: O(n) because of explicit stack
var reverseList = function (head) {
  if (head === null) return null;
  const stackArr = [];
  let current = head;
  while (current !== null) {
    stackArr.push(current.val);
    current = current.next;
  }

  current = head;
  while (stackArr.length) {
    // current is 1>2>3>4>5
    current.val = stackArr.pop();
    // current is now 5>2>3>4>5 which means head is also 5>2>3>4>5 since current points to head
    current = current.next;
    // current: 2>3>4>5
  }
  return head;
};

// Alternate approach with similar TC.
// Instead of mutating the values, we reconstruct the linkedlist
var reverseList = function (head) {
  if (head === null) return null;
  const stackArr = [];
  let current = head;
  while (current !== null) {
    stackArr.push(current);
    current = current.next;
  }

  current = stackArr.pop();
  head = current;
  while (stackArr.length) {
    current.next = stackArr.pop();
    current = current.next;
  }
  current.next = null;

  return head;
};
