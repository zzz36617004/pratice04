package com.javaex.problem01;

public class MyBase extends Base{
	
   public void service(String state) {
	   if(state.equals("낮")){
		   System.out.println("낮에는 열심히 일하자");
		   
	   }
	   else if (state.equals("밤")) {
		   System.out.println("night");
	   }
	   else {
		   System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	   }
   }
    
}
