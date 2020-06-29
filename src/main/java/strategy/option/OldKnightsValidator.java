package main.java.strategy.option;

import main.java.strategy.domain.Knight;

public class OldKnightsValidator implements KnightValidator{
	
	public boolean validate(Knight knight){
		
		return knight.getAge()>60;
	}
	
}