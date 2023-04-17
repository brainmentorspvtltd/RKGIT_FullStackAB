package com.bmpl.todo.task;

import java.util.ArrayList;

public class Task implements ITaskManager {
	ArrayList<TaskDAO> taskList;
	
	public Task() {
		taskList = new ArrayList<>();
	}
	
	@Override
	public void addTask() {
		TaskDAO obj = new TaskDAO();
		obj.setTaskName(null);
		obj.setTaskDesc(null);
		taskList.add(obj);		
	}

	@Override
	public void deleteTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAllTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTask() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadTask() {
		// TODO Auto-generated method stub
		
	}

}
