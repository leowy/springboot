# springboot scheduler 调度器

默认的定时任务为单线程
通过java配置类设置为多线程  

		//定时触发
		@Scheduled(cron="* * * * * ?")
		//延时触发，以任务结束为开始时间
		@Scheduled(fixedDelay=5000L)	
		//间隔触发，以任务开始为开始时间
		@Scheduled(fixedRate=5000L)
		//初始延时2秒后，间隔触发	
		@Scheduled(initialDelay = 2000L,fixedRate=5000L)