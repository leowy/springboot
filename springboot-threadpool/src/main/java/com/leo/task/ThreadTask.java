package com.leo.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**  
 *
 *  @author	Zhang Wei
 */
@Slf4j
@Component
public class ThreadTask {
	
	@Async("serviceExecutor")
	public void thread1() {
		while(true) {
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info("this is thread1");
		}
	}
	
	@Async("serviceExecutor")
	public void thread2() {
		while(true) {
			try {
				Thread.sleep(2000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info("this is thread2");
		}
	}
	

}
