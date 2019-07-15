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
 * @Description: ���Բ�����
 * @author:yed
 * @date: 2019��7��15�� ����8:41:34
 */
public class AccTest {
		
	/**
	 * 
	 * @Title: isTrue 
	 * @Description: ���Զ���Ϊ��
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void isTrue() throws AccertExtion {
		DuyaUtil.isTrue(1<2, "����΢��");
	}
	
	/**
	 * 
	 * @Title: isFalse 
	 * @Description:���Զ���Ϊ��
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void isFalse() throws AccertExtion {
		DuyaUtil.isFalse(1>2, "����΢��");
	}
	
	/**
	 * 
	 * @Title: notNull 
	 * @Description: ���Էǿ�
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void notNull() throws AccertExtion {
		DuyaUtil.notNull(1, "���Բ�Ϊ��");
	}
	
	/**
	 * 
	 * @Title: isNull 
	 * @Description: ����Ϊ��
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void isNull() throws AccertExtion {
		DuyaUtil.isNull(null, "����Ϊ��");
	}
	
	/**
	 * 
	 * @Title: notEmpty 
	 * @Description: ���Լ��ϲ�Ϊ��
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void notEmpty() throws AccertExtion {
		List<Object> l =  new ArrayList<Object>();
		List<Object> ll =  new ArrayList<Object>();
		ll.add(1);
		DuyaUtil.notEmpty(ll, "���Լ��ϲ�Ϊ��");
	}
	
	/**
	 * 
	 * @Title: mapnotEmpty 
	 * @Description: ����Map��Ϊ��
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void mapnotEmpty() throws AccertExtion {
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(1,"111");
		DuyaUtil.notEmpty(map, "����Map���ϲ�Ϊ��");
	}
	
	/**
	 * 
	 * @Title: hasText 
	 * @Description: �����ַ���ȥ�ո����ֵ
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void hasText() throws AccertExtion {
		
		
		DuyaUtil.hasText("     ", "�����ַ���ȥ�ո�Ϊ��");
	}
	
	/**
	 * 
	 * @Title: greaterThanZero 
	 * @Description: ���Դ��ڵ���0
	 * @throws AccertExtion
	 * @return: void
	 */
	@Test
	public void greaterThanZero() throws AccertExtion {
		
		BigDecimal b = new BigDecimal(0);
		
		DuyaUtil.greaterThanZero(b,"����0");
	}
	
}
