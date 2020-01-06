package com.crosslab.blockmanager.bean;

import com.crosslab.blockmanager.model.Member;
import com.crosslab.blockmanager.model.Permission;

import java.util.List;

/**
 * @author crosslab wrote on 2018/3/19.
 */

public class PermissionData extends BaseData {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
