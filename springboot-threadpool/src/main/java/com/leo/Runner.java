package com.leo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.leo.task.ThreadTask;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private ThreadTask task;

	@Override
	public void run(String... args) throws Exception {
		task.thread1();
		task.thread2();
	}

}
