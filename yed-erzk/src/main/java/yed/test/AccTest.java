package yed.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import yed.utils.AccertExtion;
import yed.utils.DuyaUtil;

/**
 * 
 * @ClassName: AccTest 
 * @Description: 断言测试类
 * @author:yed
 * @date: 2019年7月15日 上午8:41:34
 */
public class AccTest {
		
	/**
	 * 
	 * @Title: isTrue 
	 * @Description: 测试断言为真
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void isTrue() throws AccertExtion {
		DuyaUtil.isTrue(1<2, "断言微真");
	}
	
	/**
	 * 
	 * @Title: isFalse 
	 * @Description:测试断言为假
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void isFalse() throws AccertExtion {
		DuyaUtil.isFalse(1>2, "断言微假");
	}
	
	/**
	 * 
	 * @Title: notNull 
	 * @Description: 测试非空
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void notNull() throws AccertExtion {
		DuyaUtil.notNull(1, "断言不为空");
	}
	
	/**
	 * 
	 * @Title: isNull 
	 * @Description: 测试为空
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void isNull() throws AccertExtion {
		DuyaUtil.isNull(null, "断言为空");
	}
	
	/**
	 * 
	 * @Title: notEmpty 
	 * @Description: 测试集合不为空
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void notEmpty() throws AccertExtion {
		List<Object> l =  new ArrayList<Object>();
		List<Object> ll =  new ArrayList<Object>();
		ll.add(1);
		DuyaUtil.notEmpty(ll, "断言集合不为空");
	}
	
	/**
	 * 
	 * @Title: mapnotEmpty 
	 * @Description: 测试Map不为空
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void mapnotEmpty() throws AccertExtion {
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(1,"111");
		DuyaUtil.notEmpty(map, "断言Map集合不为空");
	}
	
	/**
	 * 
	 * @Title: hasText 
	 * @Description: 测试字符串去空格后有值
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void hasText() throws AccertExtion {
		
		
		DuyaUtil.hasText("     ", "断言字符串去空格不为空");
	}
	
	/**
	 * 
	 * @Title: greaterThanZero 
	 * @Description: 测试大于等于0
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void greaterThanZero() throws AccertExtion {
		
		BigDecimal b = new BigDecimal(0);
		
		DuyaUtil.greaterThanZero(b,"大于0");
	}
	
}
