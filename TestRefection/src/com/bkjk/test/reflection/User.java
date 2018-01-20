package com.bkjk.test.reflection;

public class User {
	private String id;
	private String name;
	private String addr;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String toString() {
		return "Demo01 [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	public User() {
		super();
	}
	public User(String id, String name, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
}
