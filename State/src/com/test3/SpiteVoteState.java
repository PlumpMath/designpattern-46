package com.test3;

public class SpiteVoteState implements VoteState {

	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ
		//ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
		String s = voteManager.getMapVote().get(user);
		if(s != null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("���ж���ͶƱ��Ϊ��ȡ��ͶƱ�ʸ�");
	}

}
