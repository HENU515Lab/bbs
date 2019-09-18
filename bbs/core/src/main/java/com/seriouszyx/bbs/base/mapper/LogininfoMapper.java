package com.seriouszyx.bbs.base.mapper;

import com.seriouszyx.bbs.base.domain.Logininfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogininfoMapper {

    int insert(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    List<Logininfo> selectAll();

    int updateByPrimaryKey(Logininfo record);

    /**
     * 根据用户名查询用户数量
     * @param username
     * @return
     */
    int getCountByUsername(String username);

    /**
     * 用户登陆
     * @param username
     * @param encode
     * @param userType
     * @return
     */
    Logininfo login(@Param("username") String username,
                    @Param("password") String encode, @Param("userType") int userType);
}