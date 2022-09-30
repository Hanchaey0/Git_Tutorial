package test;

import ch04._03_Bus;

public class _03_Student{
	String studentName;
	int grade;
	int money;

	public _03_Student(){}
	public _03_Student(String studentName, int money){
		this.studentName = studentName;
		this.money = money;}


	public void takeBus(_03_Bus bs){
		bs.take(1000);
		 money -= 1000;
		}
	public void takeSubway(_03_Subway sy){
		sy.take(1400);
		this.money -= 1400;
	}
	public void takeTaxi(_03_Taxi ty){
		ty.take (2000);
		this.money -= 2000;
	}
	public void showInfo(){
		System.out.println( studentName + "의 남은 돈은 "+  money + "원입니다. ");
	}
}