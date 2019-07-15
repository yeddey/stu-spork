package day9.ttt;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class ListT {
		
		
		
		@Test
		public void test1() {
			LinkedList<String> l = new LinkedList<>();
			l.add("Y");
			l.add("E");
			l.add("D");
			
			String rm = l.remove(0);
			System.out.println(rm);
			System.out.println(l);
		}
		
		
		
		@Test
		public void test2() {
			
			System.out.println(Integer.MAX_VALUE);
			ArrayList<String> list = new ArrayList<String>(5);
			list.add("a");
			list.add("b");
			list.add("c");  // c替换成x ,返回老的值c
			list.add("d");
			list.add("e");
			list.add("f");
			
			String old = list.set(0, "A");
			System.out.println(old);
			String rm = list.remove(0);
			System.out.println(rm);
			
			ArrayList<Object> list2 = new ArrayList<>(list);
			
			System.out.println(list2);
			
		}
		
		
		
		private static void likeStack() {
			
			LinkedList<Object> s = new LinkedList<>();
			
			s.push(1111);
			s.push(222);
			s.push(33);
			s.push(4);
			
			System.out.println(s);
			s.pop();
			System.out.println("取出栈顶"+s);
			
		}
		
		
		public static void main(String[] args) {
			likeStack();
		}
		
		
		
	
	
}
