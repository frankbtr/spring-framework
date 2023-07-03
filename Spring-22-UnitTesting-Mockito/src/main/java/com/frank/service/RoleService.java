package com.frank.service;

import com.frank.dto.RoleDTO;

import java.util.List;

public interface RoleService {

    List<RoleDTO> listAllRoles();
    RoleDTO findById(Long id);
}
