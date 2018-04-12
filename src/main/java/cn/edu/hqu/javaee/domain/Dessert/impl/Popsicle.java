package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
public class Popsicle implements Dessert {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("正在吃冰棒");
		
	}

}
