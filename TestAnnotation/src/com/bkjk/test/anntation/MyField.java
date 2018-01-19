package com.bkjk.test.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @ClassName: MyAnnotation02   
 * @Description: �Զ���ע��
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-20 ����1:44:43     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */
@Target(ElementType.FIELD) //���Լ���
@Retention(RetentionPolicy.RUNTIME) //����
public @interface MyField {
	String ColumnName() default "";
	String ColumnType();
	int length() default 0;
}
