package io.gmh.service.impl;


import io.gmh.entity.Menu;
import io.gmh.mapper.MenuMapper;
import io.gmh.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class MenuServiceImpl extends BaseServiceImpl<MenuMapper, Menu, Long> implements MenuService {

    @Override
    public List<Menu> selectListByIds(List<Long> ids) {
        return mapper.selectListByIds(ids);
    }

    @Override
    public List<Menu> selectListByMap(Map<String, Object> map) {
        return mapper.selectListByMap(map);
    }


}
