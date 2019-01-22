package com.leo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import lombok.extern.slf4j.Slf4j;

/**  
 * 	设置schedule线程池
 * 
 *  @author	Leowy Zhuang
 */
@Slf4j
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(taskScheduler());
	}
	
	@Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler executor = new ThreadPoolTaskScheduler();
        executor.setPoolSize(5);
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setThreadNamePrefix("schedule");
        executor.setRemoveOnCancelPolicy(true);
        executor.setAwaitTerminationSeconds(10);
        executor.setErrorHandler(t -> log.error("Error occurs", t));
        return executor;
    }
}
