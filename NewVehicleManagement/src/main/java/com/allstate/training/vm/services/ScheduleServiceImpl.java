package com.allstate.training.vm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allstate.training.vm.daos.ScheduleDao;
import com.allstate.training.vm.entities.Schedule;
import com.allstate.training.vm.exceptions.BuisnessException;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleDao scheduleDao;

	public void addSchedule(Schedule sc) throws BuisnessException{
		if (sc.getScheduleId().startsWith("SC")) {
			scheduleDao.addSchedule(sc);
		} else
			throw new BuisnessException("Invalid Schedule Id given, hence Schedule NOT ADDED");
	}

	public void updateSchedule(String scheduleId, String date, String time) throws BuisnessException {
		if (!scheduleId.isEmpty()) {
			scheduleDao.updateSchedule(scheduleId, date, time);
		} else
			throw new BuisnessException("Invalid Schedule Id given, hence Schedule NOT UPDATED");
	}

	public void deleteSchedule(String scheduleId) throws BuisnessException{
			scheduleDao.deleteSchedule(scheduleId);
		}

	public Schedule getScheduleById(String scheduleId) throws BuisnessException{
		if (scheduleId.startsWith("SC")) {
			Schedule schedule = scheduleDao.getScheduleById(scheduleId);
			return schedule;
		} else
			throw new BuisnessException("Invalid Schedule Id given, hence Schedule NOT RETRIEVED");
	}

	public List<Schedule> getScheduleByRouteId(String routeId) throws BuisnessException{
		
			List<Schedule> schedules = scheduleDao.getScheduleByRouteId(routeId);
			if(schedules.isEmpty()) {
				throw new BuisnessException("No schuedules available for routeid");
			}else {
			return schedules;
			}
	}

	public List<Schedule> getAllSchedules() throws BuisnessException{
		List<Schedule> schedules = scheduleDao.getAllSchedules();
		if (!schedules.isEmpty()) {
			return schedules;
		} else {
			throw new BuisnessException("No Schedules Available");
		}
	}

}
