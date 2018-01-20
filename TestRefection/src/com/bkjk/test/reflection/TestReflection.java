package com.bkjk.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @ClassName: TestReflection   
 * @Description: 根据反射API：动态获取类信息
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-20 下午11:55:03     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */
public class TestReflection {
	public static void main(String[] args) throws Exception{
			Class clazz = Class.forName("com.bkjk.test.reflection.User");
			System.out.println(clazz);
			
			//获取类信息
			String className = clazz.getCanonicalName();
			System.out.println(className);
			String simpleName = clazz.getSimpleName();
			System.out.println(simpleName);
			
			//获取属性信息
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println("属性:--"+fields[i].getName());
			}
			Field field = clazz.getDeclaredField("id");
			System.out.println("属性:--"+field);
			
			//获取构造器信息
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for (int i = 0; i < constructors.length; i++) {
				System.out.println("构造器:--"+constructors[i]);
			}
			Constructor constructor = clazz.getConstructor(null);
			System.out.println("构造器:--"+constructor);
			
			//获取方法信息
			Method[] methods = clazz.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println("方法:----"+methods[i]);
			}
			Method method = clazz.getDeclaredMethod("setAddr", new Class[]{String.class});
			System.out.println("方法:----"+method);
			
			
	}
}
