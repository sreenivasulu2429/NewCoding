package com.java.todo;
import java.util.*;
public class DailyTasksService {
		public static void task(TaskService tasks) {
			while(true) {
				System.out.println("\n1.AddTasks \n2.RemoveTasks \n3.ViewTasks\n");
				Scanner sc=new Scanner(System.in);
				int option=sc.nextInt();
				switch(option) {
				case 1:
					tasks.AddTask();
					break;
				case 2:
					tasks.RemoveTask();
					break;
				case 3:
					tasks.ViewTask();
					break;
				 case 4:
                    System.out.println("Exiting Task Menu. Thank you!");
                    return;
	             default:
                    System.out.println("Invalid option. Please try again.");
				}
			}
		}
	public static void main(String[] args) {
		UserService users=new UserService();
		TaskService tasks=new TaskService();
		System.out.println("Welcome to TO-DO List Application !");
		while(true) {
			System.out.println("\n1.Register \n2.Login");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			switch(option) {
			case 1:
				users.Register();
				break;
			case 2:
				if(users.Login()) {
					task(tasks);
					
           	}  
				break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
			}
		}
	}
}
