/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
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
    public ListNode deleteDuplicates(ListNode head) {

        /* 先用cur跳过所有重复，再跟pre连接。e.g.[1,2,2,2,2,3,3]
        ListNode cur = head, pre = head;
        while (cur != null && cur.next != null) {
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            cur = cur.next;
            pre.next = cur;
            pre = cur;
        }
        return head;
    }
    */

        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}

// @lc code=end

