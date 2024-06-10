//Leetcode 143: Reorder List
//https://leetcode.com/problems/reorder-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        //Method: two pointers, one at each end but with linked lists
        //use a slow and fast pointer to try to find the middle value of the list
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse the second half
        //splitting up the first half with second half
        ListNode second = slow.next;
        ListNode prev = slow.next = null;
        while (second != null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        //merge two halfs
        ListNode first = head;
        second = prev;
        while (second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)
