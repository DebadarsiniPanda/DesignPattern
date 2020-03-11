package com.epam.design_pattern.PatternComposite;

public class Apps {
public void showData() {
		
		Component hd =  new Leaf(4000,"HDD");
		Component mouse = new Leaf(150,"Mouse");
		Component monitor = new Leaf(6000,"Monitor");
		Component ram = new Leaf(3000,"RAM");
		Component cpu =  new Leaf(10000,"CPU");
		
		Composite ph = new Composite("Peri");
		Composite cabinet = new Composite("Cabinet");
		Composite motherBoard = new Composite("Mother Board");
		Composite computer = new Composite("Computer");
		
		motherBoard.addComponent(cpu);
		motherBoard.addComponent(ram);
		
		
		ph.addComponent(mouse);
		ph.addComponent(monitor);
		
		cabinet.addComponent(hd);
		cabinet.addComponent(motherBoard);
		
		computer.addComponent(ph);
		computer.addComponent(cabinet);
		
		ram.showPrice();
		ph.showPrice();
		computer.showPrice();
		
		
	}

}
