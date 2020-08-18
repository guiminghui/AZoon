package io.gmh.mapper;



import io.gmh.entity.Role;

import java.util.List;

/**
 * 角色数据库操作接口
 * @author huangmengwei
 *
 */
public interface RoleMapper extends BaseMapper<Role, Long>{

    
    /**
     * 根据多个id查询列表
     * @param ids
     * @return
     */
    List<Role> selectListByIds(List<Long> ids);
    
    /**
     * 查询有效的列表 
     * @return
     */
    List<Role> selectVaildList();
    
}
