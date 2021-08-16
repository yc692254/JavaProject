package com.test.lab02;

import java.util.concurrent.TimeUnit;

public class Recording {
	
	private String ARTIST;
	
	private String NAME;
	
	private long DURATION_IN_SECONDS;
	
	public Recording() {
		this.ARTIST = "Unknown";
		this.NAME   = "Unknown";
		this.DURATION_IN_SECONDS = 0;
	}

	public Recording(String aRTIST, String nAME, int dURATION_IN_SECONDS) {
		this.ARTIST = aRTIST;
		this.NAME   = nAME;
		if(dURATION_IN_SECONDS < 0) {
			this.DURATION_IN_SECONDS =0;
		}else {
			this.DURATION_IN_SECONDS = dURATION_IN_SECONDS;
		}
	}
	
	
	public String play() {
		String showMsg ="ERROR: cannot play this recording";
		if (DURATION_IN_SECONDS != 0) {
			showMsg = String.format("Now playing:%s - %s [%s]", this.ARTIST, this.NAME, covertTime());
		}
		return showMsg;
	}

	public String getARTIST() {
		return ARTIST;
	}

	public String getNAME() {
		return NAME;
	}

	public long getDURATION_IN_SECONDS() {
		return DURATION_IN_SECONDS;
	}

	@Override
	public String toString() {
		return String.format("%s - %s [%s]", this.ARTIST, this.NAME, covertTime());
	}
	
	
	private String covertTime() {
		long DURATION = this.DURATION_IN_SECONDS * 1000;
		long minutes  = TimeUnit.MILLISECONDS.toMinutes(DURATION);
		long seconds  = TimeUnit.MILLISECONDS.toSeconds(DURATION);
		long middles   = seconds- TimeUnit.MINUTES.toSeconds(minutes);
		String time = String.format("%dm%ds", minutes,middles);
		return time;
		
	}
	
	
	
	
	

}
