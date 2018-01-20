package com.bkjk.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @ClassName: TestReflection   
 * @Description: ���ݷ���API����̬��ȡ����Ϣ
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-20 ����11:55:03     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */
public class TestReflection {
	public static void main(String[] args) throws Exception{
			Class clazz = Class.forName("com.bkjk.test.reflection.User");
			System.out.println(clazz);
			
			//��ȡ����Ϣ
			String className = clazz.getCanonicalName();
			System.out.println(className);
			String simpleName = clazz.getSimpleName();
			System.out.println(simpleName);
			
			//��ȡ������Ϣ
			Field[] fields = clazz.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				System.out.println("����:--"+fields[i].getName());
			}
			Field field = clazz.getDeclaredField("id");
			System.out.println("����:--"+field);
			
			//��ȡ��������Ϣ
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for (int i = 0; i < constructors.length; i++) {
				System.out.println("������:--"+constructors[i]);
			}
			Constructor constructor = clazz.getConstructor(null);
			System.out.println("������:--"+constructor);
			
			//��ȡ������Ϣ
			Method[] methods = clazz.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println("����:----"+methods[i]);
			}
			Method method = clazz.getDeclaredMethod("setAddr", new Class[]{String.class});
			System.out.println("����:----"+method);
			
			
	}
}
