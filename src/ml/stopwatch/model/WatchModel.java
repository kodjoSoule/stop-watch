package ml.stopwatch.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WatchModel {
	
	//
	private String timeLabel;
	private int countTime ;
	//private Timer timer ;
	//constructor
	public WatchModel() {
        countTime = 0;
        timeLabel = "00:00:22";
		countTime = 0;
		
		//timer = new Timer(1000, timerListener());	 ;	 
		
    }
	
	public int getElapsedTime() {
		return countTime;
	}
	
	
	public void setCountTime(int elapsedTime) {
		this.countTime = elapsedTime;
	}
	
	
	
	public String getTime() {
		int hours = countTime / 3600000;
        int minutes = (countTime % 3600000) / 60000;
        int seconds = (countTime % 60000) / 1000;
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return time;
        
		
	}
	
}
