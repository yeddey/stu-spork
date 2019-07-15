package yed.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName: DuyaUtil 
 * @Description: ���Թ�����
 * @author:yed
 * @date: 2019��7��15�� ����8:41:49
 */
public class DuyaUtil {
		
	
	
	
		/**
		 * 
		 * @Title: isTrue 
		 * @Description: ����Ϊ��
		 * @param b
		 * @param mes
		 * @throws AccertExtion
		 * @return: void
		 */
		public static void isTrue(boolean b,String mes) throws AccertExtion {
			if(!b) {
				throw new AccertExtion(mes);
			}
		}
		
		
		
		/**
		 * 
		 * @Title: isTrue 
		 * @Description: ����Ϊ��
		 * @param b
		 * @param mes
		 * @throws AccertExtion
		 * @return: void
		 */
		public static void isFalse(boolean b,String mes) throws AccertExtion {
			if(b) {
				throw new AccertExtion(mes);
			}
		}
		
		
		
		
		/**
		 * 
		 * @Title: notNull 
		 * @Description: ���Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣
		 * @param obj
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		public static void notNull(Object obj, String message) throws AccertExtion{
			//TODO ʵ�ִ���
			if(obj==null) {
				throw new AccertExtion(message);
			}
			
		}
		
		
		
		/**
		 * 
		 * @Title: isNull 
		 * @Description: ���Զ���Ϊ�գ������Ϊ�գ����׳��Զ����쳣
		 * @param obj
		 * @param message
		 * @throws AccertExtion
		 * @return: void
		 */
		public static void isNull(Object obj, String message) throws AccertExtion{
			//TODO ʵ�ִ���
			if(obj!=null) {
				throw new AccertExtion(message);
			}
			
		}
		
		/**
		 * 
		 * @Title: notEmpty 
		 * @Description: ���Լ��ϲ�Ϊ��
		 * @param coll
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		
		public static void notEmpty(Collection<?> coll, String message) throws AccertExtion{
			//TODO ʵ�ִ���
			if(coll==null || coll.size()==0) {
				throw new AccertExtion(message);
			}
		}
	
	
		/**
		 * 
		 * @Title: notEmpty 
		 * @Description: ����Map���ϲ�Ϊ��
		 * @param coll
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		
		public static void notEmpty(Map<?,?> map, String message) throws AccertExtion{
			//TODO ʵ�ִ���
			if(map==null || map.isEmpty()) {
				throw new AccertExtion(message);
			}
		}
		
		
		/**
		 * 
		 * @Title: hasText 
		 * @Description: T�����ַ���������ֵ��ȥ���ո�
		 * @param condition
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		public static void hasText(String s, String message) throws AccertExtion{
			//TODO ʵ�ִ���
			if(s.trim().length()==0) {
				throw new AccertExtion(message);
			}
			
		}
		
		
		public static void greaterThanZero(BigDecimal value, String message) throws AccertExtion{
			//TODO ʵ�ִ���
			if(value.intValue()<=0) {
				throw new AccertExtion(message);
			}
		}
		
		
}
