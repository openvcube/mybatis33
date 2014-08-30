/**
 * Copyright(c) http://www.open-v.com
 */
package com.openv.mybatis.example;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * <pre>
 * CustomerDemo测试类。
 * </pre>
 * @author http://www.open-v.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
public class EhcacheDemo {
 
	private static final Log log = LogFactory.getLog(EhcacheDemo.class);
	
	public static void main(String[] args) throws IOException {
		String resource = "com/openv/mybatis/example/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		String statementId ="com.openv.mybatis.example.ehcache.selectById";
		String customerId = "2";//客户ID
		log.info("第一次查询");
		Customer customer = sqlSession.selectOne(statementId, customerId);
		log.info("第二次查询");
		Customer customer2 = sqlSession.selectOne(statementId, customerId);
		
		sqlSession.close();
		log.info(customer2);
	}

}
