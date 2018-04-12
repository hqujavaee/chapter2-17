package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;
import cn.edu.hqu.javaee.domain.Dessert.impl.annotation.Cold;
import cn.edu.hqu.javaee.domain.Dessert.impl.annotation.Creamy;

@Component
@Cold
@Creamy
public class IceCream implements Dessert {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("正在吃冰激凌");
		
	}

}
