package com.demo.mail.member.dao;

import com.demo.mail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 10:53:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
