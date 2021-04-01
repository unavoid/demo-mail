package com.demo.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.mail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author fengxinhui
 * @email 1120964090@qq.com
 * @date 2021-04-01 10:53:14
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

