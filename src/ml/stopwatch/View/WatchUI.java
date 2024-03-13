package ml.stopwatch.View;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class WatchUI extends JFrame {
	
	private JLabel timeLabel ;
	
	private JButton startButton ;
	private JButton stopButton ;
	private JButton resetButton ;
	
	//
	Timer timer ;
	

	public WatchUI() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//setSize(400, 200);
		setSize(300, 160);
		setResizable(false);
		setAlwaysOnTop(true);
		setLayout(new BorderLayout());	
		
		//
		JPanel contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(3,1));
		
		//Title panel
		JPanel panel_0 = new JPanel();
		panel_0.setLayout(new FlowLayout());
		JLabel titre = new JLabel("developed by Kodjo");
		//font weight of titre
		
		titre.setFont(new java.awt.Font("Arial", 1, 15));
		panel_0.add(titre);
		
		//show the time
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new FlowLayout());
		timeLabel = new JLabel("00:00:00");
		//change color of timeLabel
		timeLabel.setForeground(Color.GRAY);
		timeLabel.setFont(new java.awt.Font("Tahoma", 1, 20));
		panel_1.add(timeLabel);
		//btn group panel
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout());
		//start button
		startButton = new JButton("Start");
		panel_2.add(startButton);
		//stop button
		stopButton = new JButton("Stop");
		panel_2.add(stopButton);
		//reset button
		resetButton = new JButton("Reset");
		panel_2.add(resetButton);
		
		//
		
		contentPane.add(panel_1);
		contentPane.add(panel_2);
		contentPane.add(panel_0);
		
		
		//
		this.add(contentPane, BorderLayout.CENTER);
	}
	//getTimer
	public Timer getTimer() {
        return timer;
    }
	//setTimer
	public void setTimer(Timer timer) {
        this.timer = timer;
    }
	//addTimer
	public void addTimerListener(ActionListener timerListener){
		timer = new Timer(1000, timerListener);
	}
	
	public void addStartButtonListener(ActionListener listenerStartButton){
		startButton.addActionListener(listenerStartButton);
	}
	
    public void addStopButtonListener(ActionListener listenerStopButton){
        stopButton.addActionListener(listenerStopButton);
    }
    
    public void addResetButtonListener(ActionListener listenerResetButton){
        resetButton.addActionListener(listenerResetButton);
    }
    //get and set timeLabel
    public JLabel getTimeLabel() {
        return timeLabel;
    }
    public void setTimeLabel(String timeLabel) {
    	
        this.timeLabel.setText(timeLabel);
    }
    

	

	

}
