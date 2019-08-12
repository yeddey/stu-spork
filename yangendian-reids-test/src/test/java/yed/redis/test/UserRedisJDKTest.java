package yed.redis.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import com.yangchunbo.common.utils.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import yed.redis.dao.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-beans2.xml"})
public class UserRedisJDKTest {
	
	
	@Resource
	private RedisTemplate<String, Object> redis;
	
	@SuppressWarnings("deprecation")
	@Test
	/**
	 * 
	 * @Title: user_test_set 
	 * @Description: 使用JDK系列化方式保存十万个user随机对象
	 * @return: void
	 */
	public void user_test_set() {
		
		List<User> list = new ArrayList<User>();
		
		for (int i = 0; i <=100000 ; i++) {
			if(i%2==0)
			list.add(new User(i, StringUtil.randomChineseString(3),"男", "13"+RandomUitl.randoms(0, 9,9),RandomUitl.randomCharacters(5)+"qq.com",DateUtil.randomDate(new Date(2001,1,2)).toString() ));
			else
			list.add(new User(i, StringUtil.randomChineseString(3),"女", "13"+RandomUitl.randoms(0, 9,9), RandomUitl.randomCharacters(8)+"sohu.com", DateUtil.randomDate(new Date(1949,9,1)).toString()));
		}
		long s = System.currentTimeMillis();
		redis.opsForList().rightPushAll("swUser", list);
		long e = System.currentTimeMillis();
		System.out.println("耗时"+(e-s)+"ms");
	}
	

}
