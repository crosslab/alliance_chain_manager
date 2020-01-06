package com.crosslab.blockmanager.manager;

import com.crosslab.blockmanager.repository.MemberGroupRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author crosslab wrote on 2018/3/7.
 */
@Component
public class MemberGroupManager {
    @Resource
    private MemberGroupRepository memberGroupRepository;
}
