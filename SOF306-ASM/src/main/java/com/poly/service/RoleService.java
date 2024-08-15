package com.poly.service;

import java.util.List;
import com.poly.entity.Role;

public interface RoleService {
	public List<Role> findAll();
    public Role findByRoleName(String roleName);
}
