package com.demo.ass3;

public class RunAss3 {

	public RunAss3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TvRemote sonyObj = new SONYTv();
		sonyObj.switchOn();
		sonyObj.changeChannel(105);
		sonyObj.switchOff();
		TvRemote bpltvObj = new BPLTv();
		bpltvObj.switchOn();
		bpltvObj.changeChannel(106);
		bpltvObj.switchOff();
		TvRemote panasonicObj = new PanasonicTV();
		panasonicObj.switchOn();
		panasonicObj.changeChannel(106);
		panasonicObj.switchOff();
	}

}
