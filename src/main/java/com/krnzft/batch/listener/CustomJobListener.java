package com.krnzft.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class CustomJobListener implements JobExecutionListener {

	@Override
	public void afterJob(JobExecution exec) {
		System.out.println("JOBLISTENER: Finaliza la ejecucion del job ID: " + exec.getId());
	}

	@Override
	public void beforeJob(JobExecution exec) {
		System.out.println("JOBLISTENER: Se va a realizar la ejecucion del job ID: " + exec.getId());
	}

}
