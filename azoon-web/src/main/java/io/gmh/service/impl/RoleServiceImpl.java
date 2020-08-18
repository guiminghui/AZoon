package io.gmh.service.impl;


import io.gmh.entity.Role;
import io.gmh.mapper.RoleMapper;
import io.gmh.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role, Long> implements RoleService {

    @Override
    public List<Role> selectListByIds(List<Long> ids) {
        return mapper.selectListByIds(ids);
    }

    @Override
    public List<Role> selectVaildList() {
        return mapper.selectVaildList();
    }

	
}
