package com.bkjk.test.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @ClassName: MyAnnotation02   
 * @Description: 自定义注解
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-20 上午1:44:43     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */
@Target(ElementType.FIELD) //属性级别
@Retention(RetentionPolicy.RUNTIME) //运行
public @interface MyField {
	String ColumnName() default "";
	String ColumnType();
	int length() default 0;
}
