package com.javaex.problem04;

public class Duck extends Bird {
	private String name;
    public void sing() {
    	System.out.println("오리("+name+")가 소리내어웁니다.");
    }

    public void fly() {
    System.out.println("오리("+name+")가 날지않습니다.");
    }
    
    public void showName() {
    System.out.println("오리의 이름은"+name+"입니다.");
    }
    

	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

}
