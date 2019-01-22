package com.leo.timetasker;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;



/**  
 * 	定时任务
 *
 *  @author	Leowy Zhuang
 */
@Slf4j
@EnableScheduling
@Component
public class CronTasker {
	
	@Scheduled(cron="* * * * * ?")
	public void task1() {
		log.info("this is task1");
	}
	
	@Scheduled(fixedDelay=5000)
	public void task2() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("this is task2");
	}
	
	@Scheduled(fixedRate=5000)
	public void task3() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("this is task3");
	}

}
