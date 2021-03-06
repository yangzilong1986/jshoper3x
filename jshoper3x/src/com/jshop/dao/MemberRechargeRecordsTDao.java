package com.jshop.dao;

import java.util.List;

import com.jshop.entity.MemberRechargeRecordsT;

public interface MemberRechargeRecordsTDao {
	/**
	 * 增加充值记录
	 * 
	 * @param mrrt
	 */
	public void saveMemberRechargeRecordsT(MemberRechargeRecordsT mrrt);

	/**
	 * 查询所有充值记录
	 * 
	 * @param currentPage
	 * @param lineSize
	 * @return
	 */
	public List<MemberRechargeRecordsT> findAllMemberRechargeRecordsT(
			int currentPage, int lineSize);

	/**
	 * 统计查询所有充值记录
	 * 
	 * @return
	 */
	public int countfindAllMemberRechargeRecordsT();

	/**
	 * 删除所有充值记录
	 * 
	 * @param strs
	 */
	public void delMemberRechargeRecordsT(String[] strs);

}
