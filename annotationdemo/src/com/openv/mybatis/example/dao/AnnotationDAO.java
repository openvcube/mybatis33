package com.openv.mybatis.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.openv.mybatis.example.mapper.AnnotationMapper;
import com.openv.mybatis.example.vo.AddressVO;
import com.openv.mybatis.example.vo.CountryVO;
import com.openv.mybatis.example.vo.CustomerVO;
import com.openv.mybatis.example.vo.StoreVO;

/**
 * <pre>
 * 程序的中文名称。
 * </pre>
 * 
 * @author http://www.open-v.com
 * @version 1.00.00
 * 
 *          <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容:
 * </pre>
 */
public class AnnotationDAO {
	
	/**
	 * 新增国家。
	 */
	public void insertCountry(int countryId) {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CountryVO country = new CountryVO();
			country.setCountryId(countryId);
			country.setCountryName("dd");
			aMapper.insertCountry(country);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 更新国家
	 */
	public void updateCountry(int countryId) {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CountryVO country = new CountryVO();
			country.setCountryName("ee");
			country.setCountryId(countryId);
			aMapper.updateCountry(country);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 更新国家
	 */
	public void delCountry(int countryId) {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			aMapper.deleteCountry(countryId);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 查询国家
	 */
	public void selectCountry() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CountryVO country = aMapper.findCountryById(125);
			if (country != null) {
				System.out.println(country.getCountryName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 查询客户信息,1对1关联
	 */
	public void selectCustomer() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CustomerVO custmoerVO = aMapper.selectCustomersById(1);
			AddressVO adderss = custmoerVO.getAddress();
			System.out.println(adderss.getDistrict());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 查询店铺信息，一对多关联
	 */
	public void slectSotre() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			StoreVO store = aMapper.selectStoreByStoreId(1);
			List<CustomerVO> customerList = store.getCustomers();
			if (customerList != null) {
				System.out.println("店铺1的客户数为" + customerList.size());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 新增国家
	 */
	public void insertCountryWithProvider(int countryId) {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CountryVO country = new CountryVO();
			country.setCountryId(countryId);
			country.setCountryName("dd");
			aMapper.insertCountryWithProvider(country);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 更新国家。
	 */
	public void updateCountryWithProvider(int countryId2) {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CountryVO country = new CountryVO();
			country.setCountryName("ee");
			country.setCountryId(countryId2);
			aMapper.updateCountryWithProvider(country);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 更新国家。
	 */
	public void delCountryWithProvider(int country) {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("countryId", country);
		try {
			aMapper.deleteCountryWithProvider(params);//127
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	/**
	 * 查询国家。
	 */
	public void selectCountryWithProvider() {
		SqlSessionFactory sqlSessionFactory = MyBatisConnectionFactory
				.getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		AnnotationMapper aMapper = session.getMapper(AnnotationMapper.class);
		try {
			CountryVO country = aMapper.selectCountryWithProvider("Zambia");
			if (country != null) {
				System.out.println(country.getCountryId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
}
