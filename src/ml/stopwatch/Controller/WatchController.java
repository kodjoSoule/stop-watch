package ml.stopwatch.Controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.Timer;

import ml.stopwatch.View.WatchUI;
import ml.stopwatch.model.WatchModel;

public class WatchController {
	private WatchModel watchModel;
	private WatchUI watchUI ;
	//
	
	//
	public WatchController(WatchUI watchUI , WatchModel watchModel) {
		this.watchUI = watchUI ;
		this.watchModel = watchModel;
		
		
		addListerner();
		
	}
	
	public void addListerner() {
		ActionListener timerListener = new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
                watchModel.setCountTime(watchModel.getElapsedTime() + 1000);
                watchUI.setTimeLabel(watchModel.getTime());
	        	
	        }
	     };
		watchUI.addTimerListener(timerListener);
		ActionListener listenerStartButton = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				watchUI.getTimer().start();
				
			}
			
		};
		watchUI.addStartButtonListener(listenerStartButton);
		
		watchUI.addStopButtonListener(new ActionListener() {
				@Override
            public void actionPerformed(ActionEvent e) {
                watchUI.getTimer().stop();	
            }
		});
		
        watchUI.addResetButtonListener(new ActionListener() {
        		@Override
            public void actionPerformed(ActionEvent e) {
                
        		watchUI.getTimer().stop();
                watchModel.setCountTime(0);
                watchUI.setTimeLabel(watchModel.getTime());
                
            }
        });
        
	}
	
	
	
	public void start() {
		watchUI.setVisible(true);
	}
}
