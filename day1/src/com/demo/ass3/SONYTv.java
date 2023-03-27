package com.demo.ass3;

public class SONYTv implements TvRemote {

	public SONYTv() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println(SONYTv.class.getSimpleName()+" Tv Turned Off.");

	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println(SONYTv.class.getSimpleName()+" Tv Turned On.");

	}

	@Override
	public void changeChannel(int no) {
		// TODO Auto-generated method stub
		System.out.println(SONYTv.class.getSimpleName()+" Channel changed to ." + no);
	}

}
