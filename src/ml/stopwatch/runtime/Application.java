package ml.stopwatch.runtime;

import java.awt.EventQueue;

import ml.stopwatch.Controller.WatchController;
import ml.stopwatch.View.WatchUI;
import ml.stopwatch.model.WatchModel;

public class Application {
	public static void main(String[] args) {
		
		WatchController watchController = new WatchController(new WatchUI(), new WatchModel());
		watchController.start();
	}
}
