package com.oop.collections.mylist;

public class MyLinkedList extends MyAbstractList {
	MyLinkedListNode head;
	int size;

	public MyLinkedList() {
		head = null;
		size = 0;
	}

	private MyLinkedListNode getNodeByIndex(int index) {
		MyLinkedListNode current = head;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		return current;
	}

	@Override
	public void add(Object o) {
		// TODO Auto-generated method stub
		add(o, size);
	}

	@Override
	public void add(Object o, int index) {
		// TODO Auto-generated method stub
		checkBoundaries(index, size);
		if (index == 0) {
			head = new MyLinkedListNode(o, head);
		} else {
			MyLinkedListNode current = getNodeByIndex(index - 1);
			current.setNext(new MyLinkedListNode(o, current.getNext()));
		}
		size++;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		try {
			checkBoundaries(index, size - 1);
			if (index == 0) {
				head = head.next;
			} else {
				MyLinkedListNode current = getNodeByIndex(index - 1);
				current.next = current.next.next;
			}
			size--;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Can't remove object at index" + index);
		}
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		return getNodeByIndex(index).getPayloadObject();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
