package com.test.lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Playlist {
	private String name;
	private int numberOfRecordings=0;
	private long durationInSeconds=0;
	private int MAX_PLAYLIST_SIZE;
	private List<Recording> recordingList;
	
	public Playlist() {
		this.name = "Unknown";
		this.MAX_PLAYLIST_SIZE = 5;
		this.recordingList = new ArrayList<Recording>(this.MAX_PLAYLIST_SIZE);
	}
	
	public Playlist(String name, int listSize) {
		if (name != null) {
			this.name = name;
		}else {
			this.name = "Unknown";
		}
		if (listSize > 0) {
			this.MAX_PLAYLIST_SIZE = listSize;
			this.recordingList = new ArrayList<Recording>(this.MAX_PLAYLIST_SIZE);
		}else {
			this.MAX_PLAYLIST_SIZE = 5;
			this.recordingList = new ArrayList<Recording>(this.MAX_PLAYLIST_SIZE);
		}
	}

	public Playlist(String name, int numberOfRecordings, long durationInSeconds, int mAX_PLAYLIST_SIZE,
			List<Recording> recordingList) {
		this.name = name;
		this.numberOfRecordings = numberOfRecordings;
		this.durationInSeconds = durationInSeconds;
		this.MAX_PLAYLIST_SIZE = mAX_PLAYLIST_SIZE;
		this.recordingList = recordingList;
	}
	
	public boolean add(Recording recording) {
		boolean flag =false;
		if(null!=recording && numberOfRecordings < MAX_PLAYLIST_SIZE) {
			this.recordingList.add(recording);
			this.numberOfRecordings= recordingList.size();
			this.durationInSeconds += recording.getDURATION_IN_SECONDS();
			flag = true;
		}
		return flag;
		
	}
	
	public void play() {
		if(numberOfRecordings > 0) {
			for (Recording recording : recordingList) {
				String showMsg = recording.play();
				System.out.println(showMsg);
			}
		}else {
			String showMsg="ERROR: empty playlist";
			System.out.println(showMsg);
		}
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfRecordings() {
		return numberOfRecordings;
	}

	public long getDurationInSeconds() {
		return durationInSeconds;
	}

	public int getMAX_PLAYLIST_SIZE() {
		return MAX_PLAYLIST_SIZE;
	}

	public List<Recording> getRecordingList() {
		return recordingList;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append(String.format("Playlist: %s [%s]:\n", this.name, covertTime()));
		for (Recording recording : recordingList) {
			sb.append(recording.toString()+"\n");
		}
		return sb.toString();
	}
	
	private String covertTime() {
		long DURATION = this.durationInSeconds * 1000;
		long minutes  = TimeUnit.MILLISECONDS.toMinutes(DURATION);
		long seconds  = TimeUnit.MILLISECONDS.toSeconds(DURATION);
		long middles   = seconds- TimeUnit.MINUTES.toSeconds(minutes);
		String time = String.format("%dm%ds", minutes,middles);
		return time;
		
	}
	
	

}
