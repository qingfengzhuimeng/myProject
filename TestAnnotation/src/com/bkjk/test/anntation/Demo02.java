package com.bkjk.test.anntation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo02 {
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("com.bkjk.test.anntation.Demo01");
			Annotation[] annotations = clazz.getAnnotations();
			
			for (Annotation a : annotations) {
				System.out.println(a);
			}
			
			MyTable annotation = clazz.getAnnotation(MyTable.class);
			System.out.println(annotation);
			
			Field field = clazz.getDeclaredField("id");
			MyField a2 = field.getAnnotation(MyField.class);
			System.out.println(a2.ColumnName()+"--"+ a2.ColumnType()+"--"+a2.length() );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
