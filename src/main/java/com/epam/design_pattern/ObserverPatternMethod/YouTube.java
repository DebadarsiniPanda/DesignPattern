package com.epam.design_pattern.ObserverPatternMethod;

public class YouTube {

	public void youTube() {
		Channel ch1 = new Channel();
		
		Subscriber s1 = new Subscriber("Abc");
		Subscriber s2 = new Subscriber("Def");
		Subscriber s3 = new Subscriber("Pqr");
		Subscriber s4 = new Subscriber("Lmn");
		Subscriber s5 = new Subscriber("Xyz");
		
		ch1.subscribe(s1);
		ch1.subscribe(s2);
		ch1.subscribe(s3);
		ch1.subscribe(s4);
		ch1.subscribe(s5);
		
		ch1.unSubscribe(s3);
		
		s1.subscribeChannel(ch1);
		s2.subscribeChannel(ch1);
		s3.subscribeChannel(ch1);
		s4.subscribeChannel(ch1);
		s5.subscribeChannel(ch1);
		
		ch1.upload("How to learn JAVA");
	
	
	}
}
