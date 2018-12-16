package com.jdbi.dao;

import com.jdbi.mapper.UserCompleteInfoMapper;
import com.model.UserCompleInfo;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

@RegisterRowMapper(UserCompleteInfoMapper.class)
public interface UserCompleteInfoDAO {
    @SqlQuery("select * from user as u left join user_details as ud on u.uuid = ud.uuid")
    List<UserCompleInfo> getAllUserCompleteInfo();
}
