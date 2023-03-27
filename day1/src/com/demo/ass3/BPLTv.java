package com.demo.ass3;

public class BPLTv implements TvRemote {

	public BPLTv() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println(BPLTv.class.getSimpleName()+" Tv Turned Off.");
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println(BPLTv.class.getSimpleName()+" Tv Turned On.");
	}

	@Override
	public void changeChannel(int no) {
		// TODO Auto-generated method stub
		System.out.println(BPLTv.class.getSimpleName()+" Channel changed to "+no);
	}

}
