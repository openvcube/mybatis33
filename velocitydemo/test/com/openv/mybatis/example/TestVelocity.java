package com.openv.mybatis.example;

import com.openv.mybatis.example.dao.VelocityDAO;

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
public class TestVelocity {
	
	public static void main(String[] args) {
		VelocityDAO dao=new VelocityDAO();
	    dao.slectCustomerWithParam();
		dao.slectCustomerWithExpression();
		dao.slectCustomerWithIterExpression();
	}
}
