package com.openv.mybatis.example.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.openv.mybatis.example.mapper.VelocityMapper;
import com.openv.mybatis.example.vo.CustomerVO;


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
public class VelocityDAO {
    /**
     * ���ò�����ѯ
     */
	public void slectCustomerWithParam() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		VelocityMapper vMapper = session.getMapper(VelocityMapper.class);
		try {
 			 CustomerVO param=new CustomerVO();
			param.setLastName("MART%");
			List<CustomerVO> customerList=	vMapper.getNameWithParam(param);
			for (CustomerVO customerVO : customerList) {
			 System.out.println(customerVO.toString());
			}
		} finally {
			session.close();
		}
	}

	 /**
	 *
     * ���ñ��ʽ��ѯ
     */
	   
	public void slectCustomerWithExpression() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		VelocityMapper vMapper = session.getMapper(VelocityMapper.class);
		try {
 			 CustomerVO param=new CustomerVO();
			param.setLastName("MART%");
			List<CustomerVO> customerList=	vMapper.getNameWithExpression(param);
			for (CustomerVO customerVO : customerList) {
			 System.out.println(customerVO.toString());
			}
		} finally {
			session.close();
		}
	}
	
	 /**
	 *
    * ���õ������ʽ��ѯ
    */
	public void slectCustomerWithIterExpression() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		VelocityMapper vMapper = session.getMapper(VelocityMapper.class);
		try {
 			 CustomerVO param=new CustomerVO();
 			 List<Integer> ids=new ArrayList<Integer>();
             ids.add(1);
             ids.add(2);
             ids.add(3);
             param.setIds(ids);
			List<CustomerVO> customerList=	vMapper.getNameWithIterExpression(param) ;
			for (CustomerVO customerVO : customerList) {
			 System.out.println(customerVO.toString());
			}
		} finally {
			session.close();
		}
	}
	
}
