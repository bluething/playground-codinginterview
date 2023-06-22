package io.github.bluething.playground.codinginterview.leetcode._100daysofcode.top_interview_150.linked_list;

// https://leetcode.com/problems/delete-node-in-a-linked-list/description/
class DeleteNodeInALinkedListTest {

    // You are given the node to be deleted node. So we have node to be delete
    // the key is "It is guaranteed that the node to be deleted is not a tail node in the list."
    // it means that the node given is between 1st node and one node before tail
    // actually we remove the next node after given node
    // but before that we copy the value then change next pointer
    private void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
