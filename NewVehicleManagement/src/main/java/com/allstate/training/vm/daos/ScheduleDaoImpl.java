package com.allstate.training.vm.daos;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allstate.training.vm.entities.Route;
import com.allstate.training.vm.entities.Schedule;

@Repository
public class ScheduleDaoImpl implements ScheduleDao {

	@Autowired
	SessionFactory sessionFactory;

	public void addSchedule(Schedule sc) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(sc);// insert statement
		session.getTransaction().commit();// for committing
		session.close();
	}

	public void updateSchedule(String scheduleId, String date, String time) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Schedule sc = (Schedule) session.get(Schedule.class, new String(scheduleId));
		sc.setDate(date);
		sc.setTime(time);
		session.update(sc);// update statement
		session.getTransaction().commit();// for committing
		session.close();
	}

	public void deleteSchedule(String scheduleId) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Schedule sc = (Schedule) session.get(Schedule.class, new String(scheduleId));// select * from Schedule where ScheduleId=?id;
		session.delete(sc);// delete from Schedule where sheduleId=?
		session.getTransaction().commit();// for committing
		session.close();
	}

	public Schedule getScheduleById(String scheduleId) {
		Session session = sessionFactory.openSession();
		Schedule sc = (Schedule) session.get(Schedule.class, new String(scheduleId));
		session.close();
		return sc;
	}

	public List<Schedule> getScheduleByRouteId(String routeId) {
		Session session = sessionFactory.openSession();
		Route route = (Route) session.get(Route.class, new String(routeId));
		Criteria cr = session.createCriteria(Schedule.class);
		cr.add(Restrictions.eq("route", route));
		List<Schedule> schedules = cr.list();
		return schedules;
	}

	public List<Schedule> getAllSchedules() {
		Session session = sessionFactory.openSession();
		List<Schedule> schedules = session.createCriteria(Schedule.class).list();
		return schedules;
	}

}
