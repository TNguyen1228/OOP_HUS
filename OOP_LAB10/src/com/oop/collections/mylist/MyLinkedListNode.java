package com.oop.collections.mylist;

public class MyLinkedListNode {
	Object payloadObject;
	MyLinkedListNode next;

	public MyLinkedListNode(Object payload) {
		this.payloadObject = payload;
	}

	public MyLinkedListNode(Object payloadObject, MyLinkedListNode next) {
		this.next = next;
		this.payloadObject = payloadObject;
	}

	public Object getPayloadObject() {
		return payloadObject;
	}

	public void setPayloadObject(Object payloadObject) {
		this.payloadObject = payloadObject;
	}

	public MyLinkedListNode getNext() {
		return next;
	}

	public void setNext(MyLinkedListNode next) {
		this.next = next;
	}
	
}
