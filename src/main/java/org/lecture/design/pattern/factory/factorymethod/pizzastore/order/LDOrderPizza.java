package org.lecture.design.pattern.factory.factorymethod.pizzastore.order;

import org.lecture.design.pattern.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import org.lecture.design.pattern.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import org.lecture.design.pattern.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
