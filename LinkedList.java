
public class LinkedList {
	Node head;

	// insert data from the beginning
	public void insertBegining(int newData) {
		System.out.println("insert beginning is called");
		Node newNode = new Node(newData);

		if (head != null) {
			Node tempNode = head;
			head = newNode;
			head.nextNode = tempNode;

		} else {
			head = newNode;
		}

	}

	// insert data at the end
	public void insert(int newData) {
		Node newNode = new Node(newData);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.nextNode != null) {
				current = current.nextNode;
			}
			current.nextNode = newNode;
		}
	}

	// delete at the begining
	public void deleteFromBegining() {
		if (head == null) {
			System.out.println("no data to delete");
		} else {
			head = head.nextNode;
		}
	}

	// delete from the end
	public void deleteFromEnd() {
		if (head == null) {
			System.out.println("no data to delete");
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
				System.out.println(" Data  " + currentNode.data);
			}
			System.out.println(currentNode.data);
			currentNode = null; // not working properly

		}
	}

	// find the recursiveLinkedList
	public boolean isRecursive() {
		Node currentNode = head;
		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
			if (currentNode.nextNode == head) {
				return true;
			}
		}

		return false;
	}

	// count the nodes
	public int NodeCount() {
		int count = 0;
		Node currentNode = head;
		if (head != null) {
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
				count++;
			}
			return count + 1;
		} else {
			return 0;
		}

	}

	// to print Linked list
	public void printAllItems() {
		Node currentNode = head;
		while (currentNode.nextNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.nextNode;
		}
		System.out.println(currentNode.data);
	}
}
