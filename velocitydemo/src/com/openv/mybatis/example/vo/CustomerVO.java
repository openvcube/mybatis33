package com.openv.mybatis.example.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * ������������ơ�
 * </pre>
 * @author http://www.open-v.com
 * @version 1.00.00
 * <pre>
 * �޸ļ�¼
 *    �޸ĺ�汾:     �޸��ˣ�  �޸�����:     �޸�����: 
 * </pre>
 */
public class CustomerVO {

	public String  lastName;
	public String  email;
	private String firstName;
	private List<Integer> ids=new ArrayList<Integer>();
	
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
	
	@Override
	public String toString() {
		return "CustomerVO [lastName=" + lastName + ", email=" + email
				+ ", firstName=" + firstName + "]";
	}

	
	 
}
