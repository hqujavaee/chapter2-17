package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Dessert;
import cn.edu.hqu.javaee.domain.Dessert.impl.annotation.Cold;
import cn.edu.hqu.javaee.domain.Dessert.impl.annotation.Creamy;

@Component
public class Child implements Consumer {
	//通过qualifer注解实现指定注入bean
	@Autowired
	@Cold
	@Creamy
	private Dessert dessert;

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		dessert.eat();
	}
}
