package com.java.todo;
import java.util.*;
public class TaskService {
	List tasks=new LinkedList();
	Scanner sc=new Scanner(System.in);

	public void AddTask() {
		System.out.println("==Adding Tasks==");
		System.out.print("Enter task: ");
		String taskName=sc.nextLine();
		tasks.add(taskName);
		System.out.println("Task add successfully !");
	}
	public void RemoveTask() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks is here to remove !");
		}
		else{
			ViewTask();
			System.out.print("Enter taskNumber: ");
			int taskNumber=sc.nextInt();
			boolean isTaskRemoved=false;
			for(int i=1;i<=tasks.size();i++) {
				if(i==taskNumber) {
					System.out.println("Task \"" + tasks.get(i - 1) + "\" removed successfully!");
	                tasks.remove(i - 1);
	                isTaskRemoved = true;
	                break;
				}	
			}
			if(!isTaskRemoved) {
				System.out.println("Invalid task number. Please try again.");
			}
		}
	}
	public void ViewTask() {
		System.out.println("==Daily Tasks==");
		if(tasks.isEmpty()) {
			System.out.println("Daily tasks are empty !");
		}
		else {
			for(int i=0;i<=tasks.size()-1;i++) {
				System.out.println(i+1+" : "+tasks.get(i));
			}	
		}	
	}	
}
