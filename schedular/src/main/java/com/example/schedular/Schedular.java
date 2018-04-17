/**
 * Basic Implementation of Schedular
 * @author Nandakumar.K
 */
package com.example.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedular {
	
	@Scheduled(fixedRate = 1000)
	public void scheduleWithFixed() {
		System.out.println("Fixed Scheduler");
	}
	
	@Scheduled(fixedDelay = 2000)
	public void scheduleWithFixedDelay() {
		System.out.println("Fixed Delay Scheduler");
	}
	
	@Scheduled(fixedRate = 2000, initialDelay = 5000)
	public void scheduleWithFixedRateAndFixedDelay() {
		System.out.println("Fixed rate and Fixed Delay Scheduler");
	}
	
	@Scheduled(cron = "0 * * * * ?")
	public void cronJob() {
		System.out.println("Cron Job");
	}
	
	/**
	 * Cron Job at day 12:am of every month.
	 */
	@Scheduled(cron="0 0 0 1 1/1 *")
	public void cronJobForEveryMonth() {
		System.out.println("Cron Job at 12:Am of every month");
	}

}
