package com.bkjk.test.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * @ClassName: TestReflection2   
 * @Description: Ӧ�÷���API:Ӧ�÷�����Ϣ
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-21 ����12:32:19     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */
public class TestReflection2 {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.bkjk.test.reflection.User");
    	System.out.println(clazz);
    	
		//��ȡ�������󣬹������
    	User user = (User)clazz.newInstance(); //��ʵ�ǵ�����User���޲ι��췽��������
    	System.out.println(user);
    	
    	Constructor c = clazz.getDeclaredConstructor(new Class[]{String.class,String.class,String.class});
    	User user2 = (User)c.newInstance(new String[]{"bkjk001","���ǽ��","��̩����"});
    	System.out.println(user2);
    	
    	//��ȡ�����󣬵��÷���
    	Method m = clazz.getDeclaredMethod("setAddr", new Class[]{String.class});
    	m.invoke(user, new String[]{"�����ŵ���վ"});
    	System.out.println(user.getAddr());
    	
    	//��ȡ���Ժ󣬲�������
    	Field f = clazz.getDeclaredField("name");
    	f.setAccessible(true); //������Բ�������ȫ��� �ˣ�����ֱ�ӷ��ʣ�
    	f.set(user, "��������");  //��һ�䲻���� �ᱨ java.lang.IllegalAccessException 
    	System.out.println(user.getName());
    	
    	
    	
	}
}







