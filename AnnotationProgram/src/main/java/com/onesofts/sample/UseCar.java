package com.onesofts.sample;

import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Car")
public class UseCar {

	@GetMapping(value = "/getCar")
	public Car getCar(@RequestBody Car c) {
		return c;
	}

	@GetMapping(value = "/CarTax")
	public Car getTax(@RequestBody Car c) {
		if (c.getPrice() > 3000000) {
			c.setPrice(c.getPrice() + c.getPrice() * 8 / 100);

		} else if (c.getPrice() > 4000000) {
			c.setPrice(c.getPrice() + c.getPrice() * 6 / 100);

		}
		return c;
	}
	
	@GetMapping(value="/Carlist")
	public List<Car> findList(@RequestBody List<Car> cars) {
		return cars;
	}
	
	@GetMapping(value="/CarMax") 
	public List<Car> findMax(@RequestBody List<Car> cars) {
		List<Car> l=new ArrayList<>();
		int max=cars.get(0).getPrice();
		for(Car x:cars) {
			if(x.getPrice()>max) {
				max=x.getPrice();
				l.add(x);
			}
		}
		return l;
	}
	
	@GetMapping(value="/CarMin")
	public List<String> findMin(@RequestBody List<Car> cars) {
		List<String> l=new ArrayList<>();
		int min=cars.get(0).getPrice();
		for(Car x:cars) {
			if(x.getPrice()<min) {
				min=x.getPrice();
				l.add(x.getBrand());
			}
		}
		return l;
	}
	@GetMapping(value="/CarColor")
	public List<Car> findColor(@RequestBody List<Car> cars) {
		List<Car> l=new ArrayList<>();
		for(Car x:cars) {
			if(x.getColor().equalsIgnoreCase("White")) {
				l.add(x);
			}
		}
		return l;
	}
	@GetMapping(value = "/CarTaxAmount")
	public List<Car> getTaxAmount(@RequestBody List<Car> cars) {
		List<Car> l=new ArrayList<>();
		for(Car x:cars)
		if (x.getPrice() > 3000000) {
			x.setPrice(x.getPrice() + x.getPrice() * 8 / 100);
			l.add(x);

		} else if (x.getPrice() > 4000000) {
			x.setPrice(x.getPrice() + x.getPrice() * 6 / 100);
			l.add(x);
		}
		return l;
	}
}
