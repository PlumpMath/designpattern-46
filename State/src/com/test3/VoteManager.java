package com.test3;
import java.util.*;

/**
 * ͶƱ����
 * @author zhang
 *
 */
public class VoteManager {
	/**
	 * ����״̬�������
	 */
	private VoteState state = null;
	
	/**
	 * ��¼�û�ͶƱ�Ľ����Map<String,String>��ӦMap<�û�����ͶƱѡ��>
	 */
	private Map<String,String> mapVote = new HashMap<String,String>();
	
	/**
	 * ��¼�û�ͶƱ������Map<String,Integer> ��ӦMap<�û����ƣ�ͶƱ�Ĵ���>
	 */
	private Map<String,Integer> mapVoteCount = 
									new HashMap<String, Integer>();
	
	/**
	 * ��ȡ�û�ͶƱ�����Map
	 * @return	��¼�û�ͶƱ�����Map
	 */
	public Map<String,String> getMapVote(){
		return mapVote;
	}
	
	/**
	 * ͶƱ
	 * @param user	ͶƱ�ˣ�Ϊ�˼򵥣������û�����
	 * @param voteItem	ͶƱ��ѡ��
	 */
	public void vote(String user,String voteItem){
		//1:��Ϊ���û�����ͶƱ�Ĵ���
		//�Ӽ�¼��ȡ�����е�ͶƱ����
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null){
			oldVoteCount = 0;
		}
		
		oldVoteCount = oldVoteCount + 1;
		mapVoteCount.put(user, oldVoteCount);
		
		//2���ж��û�ͶƱ�����ͣ�����������ͶƱ���ظ�ͶƱ������ͶƱ
		//�����Ϻ�������Ȼ�����ͶƱ���ͽ�����Ӧ�Ĳ���
		if(oldVoteCount == 1){
			//����ͶƱ
			//��¼��ͶƱ��¼��
			state = new NormalVoteState();
		}else if(oldVoteCount > 1 && oldVoteCount < 5){
			//�ظ�ͶƱ
			//��ʱ��������
			state = new RepeatVoteState();
		}else if(oldVoteCount >=5 && oldVoteCount < 8){
			//����ͶƱ
			//ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
			state = new SpiteVoteState();
		}else if(oldVoteCount >= 8){
			//������
			//�������������ֹ��¼ϵͳ
			state = new BlackVoteState();
		}
		
		//Ȼ��ת��״̬������������Ӧ�Ĳ���
		this.state.vote(user, voteItem, this);
	}
}
