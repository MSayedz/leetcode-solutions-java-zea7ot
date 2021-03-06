/**
 * https://leetcode.com/problems/linked-list-cycle/
 * 
 * Time Complexity:     O(L)
 * Space Complexity:    O(1)
 */
package com.zea7ot.leetcode.lvl3.lc0141;

import com.zea7ot.utils.data_structure.linkedlist.ListNode;

public class SolutionApproach0LinearScan {
    public boolean hasCycle(ListNode head) {
        // sanity check
        if (head == null || head.next == null)
            return false;

        ListNode slow = head, fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}