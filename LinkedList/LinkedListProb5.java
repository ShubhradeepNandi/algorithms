package com.algosample.java;

public class LinkedListProb5 {

	class Node {
		Node next;
		Object data;
	}

	/**
	 * In the Worst case scenario this is O(n^2)
	 * 
	 * @param startNode
	 * @return
	 */
	public boolean checkLoop(Node startNode) {

		Node current = startNode;

		while (current.next != null) {
			if (loopExist(startNode, current)) {
				return true;
			} else {
				current = current.next;
			}

		}

		return false;

	}

	public boolean loopExist(Node StartNode, Node limitNode) {

		Node current = StartNode;
		while (current.next != limitNode) {
			if (limitNode.next == current) {

				return true;

			} else {

				current = current.next;

			}

		}
		return false;
	}

	public boolean isCyclic(Node startNode) {
		Node slowNode = startNode;
		Node fastNode = startNode.next;

		while (true) {

			if (fastNode != null && fastNode.next != null) {

				return false;

			} else if (fastNode == slowNode || fastNode.next == slowNode) {
				return false;
			} else {

				fastNode = fastNode.next.next;
				slowNode = slowNode.next;
			}

		}

	}

}
