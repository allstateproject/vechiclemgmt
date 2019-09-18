package com.allstate.training.vm.services;

import java.util.List;
import com.allstate.training.vm.entities.Schedule;
import com.allstate.training.vm.exceptions.BuisnessException;

public interface ScheduleService  {

	public void addSchedule(Schedule sc)throws BuisnessException;
	public void updateSchedule(String scheduleId, String date, String time)throws BuisnessException;
	public void deleteSchedule(String scheduleId)throws BuisnessException;
	public Schedule getScheduleById(String scheduleId)throws BuisnessException;
	public List<Schedule> getScheduleByRouteId(String routeId)throws BuisnessException;
	public List<Schedule> getAllSchedules()throws BuisnessException;
	
}
