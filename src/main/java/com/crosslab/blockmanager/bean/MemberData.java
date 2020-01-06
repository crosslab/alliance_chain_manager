package com.crosslab.blockmanager.bean;

import com.crosslab.blockmanager.model.Member;

import java.util.List;

/**
 * @author crosslab wrote on 2018/3/19.
 */
public class MemberData extends BaseData {
    private List<Member> members;

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
