package yed.utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName: DuyaUtil 
 * @Description: 断言工具类
 * @author:yed
 * @date: 2019年7月15日 上午8:41:49
 */
public class DuyaUtil {
		
	
	
	
		/**
		 * 
		 * @Title: isTrue 
		 * @Description: 断言为真
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
		 * @Description: 断言为假
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
		 * @Description: 断言对象不为空，如果为空，则抛出自定义异常
		 * @param obj
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		public static void notNull(Object obj, String message) throws AccertExtion{
			//TODO 实现代码
			if(obj==null) {
				throw new AccertExtion(message);
			}
			
		}
		
		
		
		/**
		 * 
		 * @Title: isNull 
		 * @Description: 断言对象为空，如果不为空，则抛出自定义异常
		 * @param obj
		 * @param message
		 * @throws AccertExtion
		 * @return: void
		 */
		public static void isNull(Object obj, String message) throws AccertExtion{
			//TODO 实现代码
			if(obj!=null) {
				throw new AccertExtion(message);
			}
			
		}
		
		/**
		 * 
		 * @Title: notEmpty 
		 * @Description: 断言集合不为空
		 * @param coll
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		
		public static void notEmpty(Collection<?> coll, String message) throws AccertExtion{
			//TODO 实现代码
			if(coll==null || coll.size()==0) {
				throw new AccertExtion(message);
			}
		}
	
	
		/**
		 * 
		 * @Title: notEmpty 
		 * @Description: 断言Map集合不为空
		 * @param coll
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		
		public static void notEmpty(Map<?,?> map, String message) throws AccertExtion{
			//TODO 实现代码
			if(map==null || map.isEmpty()) {
				throw new AccertExtion(message);
			}
		}
		
		
		/**
		 * 
		 * @Title: hasText 
		 * @Description: T断言字符串必须有值，去掉空格
		 * @param condition
		 * @param message
		 * @return: void
		 * @throws AccertExtion 
		 */
		public static void hasText(String s, String message) throws AccertExtion{
			//TODO 实现代码
			if(s.trim().length()==0) {
				throw new AccertExtion(message);
			}
			
		}
		
		
		public static void greaterThanZero(BigDecimal value, String message) throws AccertExtion{
			//TODO 实现代码
			if(value.intValue()<=0) {
				throw new AccertExtion(message);
			}
		}
		
		
}
