package com.bkjk.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @ClassName: TestReflection2   
 * @Description: 应用反射API:应用反射信息
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-21 上午12:32:19     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */
public class TestReflection2 {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.bkjk.test.reflection.User");
    	System.out.println(clazz);
    	
		//获取构造器后，构造对象
    	User user = (User)clazz.newInstance(); //其实是调用了User的无参构造方法！！！
    	System.out.println(user);
    	
    	Constructor c = clazz.getDeclaredConstructor(new Class[]{String.class,String.class,String.class});
    	User user2 = (User)c.newInstance(new String[]{"bkjk001","贝壳金控","昆泰大厦"});
    	System.out.println(user2);
    	
    	//获取方法后，调用方法
    	Method m = clazz.getDeclaredMethod("setAddr", new Class[]{String.class});
    	m.invoke(user, new String[]{"朝阳门地铁站"});
    	System.out.println(user.getAddr());
    	
    	//获取属性后，操作属性
    	Field f = clazz.getDeclaredField("name");
    	f.setAccessible(true); //这个属性不会做安全检查 了，可以直接访问！
    	f.set(user, "王二麻子");  //上一句不处理 会报 java.lang.IllegalAccessException 
    	System.out.println(user.getName());
    	
    	
    	
	}
}







