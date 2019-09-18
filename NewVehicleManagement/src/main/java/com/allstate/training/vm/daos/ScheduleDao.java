package com.allstate.training.vm.daos;

import java.util.List;
import com.allstate.training.vm.entities.Schedule;

public interface ScheduleDao {
	
	public void addSchedule(Schedule sc);
	public void updateSchedule(String scheduleId, String date, String time);
	public void deleteSchedule(String scheduleId);
	public Schedule getScheduleById(String scheduleId);
	public List<Schedule> getScheduleByRouteId(String routeId);
	public List<Schedule> getAllSchedules();

}
