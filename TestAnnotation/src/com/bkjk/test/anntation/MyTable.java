package com.bkjk.test.anntation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @ClassName: MyAnnotaion01   
 * @Description:自定义注解
 * @version: 1.0
 * @author: jiabao.yan 
 * @date: 2018-1-20 上午12:17:44     
 * @Copyright: 2018 www.yjb.com Inc. All rights reserved.
 */

@Target(ElementType.TYPE) //类
@Retention(RetentionPolicy.RUNTIME) //运行 通过反射机制
public @interface MyTable {
	
	String value();
	
}
