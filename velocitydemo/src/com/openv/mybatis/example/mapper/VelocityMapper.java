package com.openv.mybatis.example.mapper;

import java.util.List;

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
public interface VelocityMapper {

	List<CustomerVO> getNameWithParam(CustomerVO param);
	
	List<CustomerVO> getNameWithExpression(CustomerVO param);
	
	List<CustomerVO> getNameWithIterExpression(CustomerVO param);

 }
