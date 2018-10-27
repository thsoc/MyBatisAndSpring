package cn.com.sm.po;

import java.util.List;

public class TestUser {
//	private Integer id;
	private Integer idx;//-------------实体可以多，不可以少（和返回数据对比）
	private String username;
	private String usercode;
	List<TestBook> bookList;
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public String getUsername() {
		return username;
	}
	public Integer getIdx() {
		return idx;
	}
	public void setIdx(Integer idx) {
		this.idx = idx;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public List<TestBook> getBookList() {
		return bookList;
	}
	public void setBookList(List<TestBook> bookList) {
		this.bookList = bookList;
	}
}
