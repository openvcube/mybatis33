package com.openv.mybatis.example;

import com.openv.mybatis.example.dao.StoreProcedureDAO;

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
public class TestSp {
    
	
	public static void main(String[] args) {
		StoreProcedureDAO dao=new StoreProcedureDAO();
		System.out.println("........1........");
		dao.callGetLastName();
		System.out.println("........2........");
		dao.callGetLastNameAnnotations();

		System.out.println("........3........");
		dao.callGetMany();
		System.out.println("........4........");
		dao.callGetManyAnnotations();
		
	}
}
