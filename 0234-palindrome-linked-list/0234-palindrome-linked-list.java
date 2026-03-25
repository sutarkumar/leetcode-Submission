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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){ // finding the middle element of the linkedlist
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode front = null;
        while(slow!=null){
            front = slow.next;
            slow.next = prev;
            prev = slow;
            slow = front;
        }

        while(prev!=null){
            if(head.val != prev.val) return false;

            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}
