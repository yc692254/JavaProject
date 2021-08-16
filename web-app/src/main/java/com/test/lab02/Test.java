package com.test.lab02;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SomeClassB b=new SomeClassB(1, 2, 3);
		System.out.println(b.toString());
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.MINUTE));
		
		long milliseconds= 201000;
		//long milliseconds= 201;
		
		/*
		 * final long hours = TimeUnit.MILLISECONDS.toHours(milliseconds) -
		 * TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(milliseconds));
		 * 
		 * long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
		 * 
		 * final long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds) -
		 * TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds));
		 */
		 final long ms = TimeUnit.MILLISECONDS.toMillis(milliseconds)
				    - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(milliseconds));
			/*
			 * System.out.println(hours); System.out.println(minutes);
			 * System.out.println(seconds);
			 */
		 String s=String.format("%dm%02ds", 
				    TimeUnit.MILLISECONDS.toMinutes(milliseconds),
				    TimeUnit.MILLISECONDS.toSeconds(milliseconds) - 
				    TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds))
				);
		 System.out.println(s);
		 
		 Recording recording=new Recording();
		 System.out.println(recording.play());
		 System.out.println(recording.toString());
		 Recording recording2=new Recording("holly","sex2312",201);
		 System.out.println(recording2.play());
		 System.out.println(recording2.toString());
		 
	}

}
