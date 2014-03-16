package com.test3;
import java.util.*;

/**
 * 投票管理
 * @author zhang
 *
 */
public class VoteManager {
	/**
	 * 持有状态处理对象
	 */
	private VoteState state = null;
	
	/**
	 * 记录用户投票的结果，Map<String,String>对应Map<用户名，投票选项>
	 */
	private Map<String,String> mapVote = new HashMap<String,String>();
	
	/**
	 * 记录用户投票次数，Map<String,Integer> 对应Map<用户名称，投票的次数>
	 */
	private Map<String,Integer> mapVoteCount = 
									new HashMap<String, Integer>();
	
	/**
	 * 获取用户投票结果的Map
	 * @return	记录用户投票结果的Map
	 */
	public Map<String,String> getMapVote(){
		return mapVote;
	}
	
	/**
	 * 投票
	 * @param user	投票人，为了简单，就用用户名称
	 * @param voteItem	投票的选项
	 */
	public void vote(String user,String voteItem){
		//1:先为该用户增加投票的次数
		//从记录中取出已有的投票次数
		Integer oldVoteCount = mapVoteCount.get(user);
		if(oldVoteCount == null){
			oldVoteCount = 0;
		}
		
		oldVoteCount = oldVoteCount + 1;
		mapVoteCount.put(user, oldVoteCount);
		
		//2：判断用户投票的类型，到底是正常投票、重复投票、恶意投票
		//还是上黑名单，然后根据投票类型进行相应的操作
		if(oldVoteCount == 1){
			//正常投票
			//记录到投票记录中
			state = new NormalVoteState();
		}else if(oldVoteCount > 1 && oldVoteCount < 5){
			//重复投票
			//暂时不做处理
			state = new RepeatVoteState();
		}else if(oldVoteCount >=5 && oldVoteCount < 8){
			//恶意投票
			//取消用户的投票资格，并取消投票记录
			state = new SpiteVoteState();
		}else if(oldVoteCount >= 8){
			//黑名单
			//加入黑名单，禁止登录系统
			state = new BlackVoteState();
		}
		
		//然后转调状态对象来进行相应的操作
		this.state.vote(user, voteItem, this);
	}
}
