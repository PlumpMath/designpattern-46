package com.test4;

public class BlackVoteState implements VoteState {
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//黑名单
		//加入黑名单，禁止登录系统
		System.out.println("进入黑名单，将禁止登录和使用本系统");
	}

}
