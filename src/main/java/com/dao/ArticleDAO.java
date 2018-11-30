package com.dao;

import com.mapper.ArticleMapper;
import com.model.Article;
import com.model.immutables.ImmutableArticle;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

@RegisterRowMapper(ArticleMapper.class)
public interface ArticleDAO {

    @SqlUpdate("insert into article (name, email, phone, aadhar_id, pan_id) values (:name, :email, :phone, :aadharId, :panId)")
    Integer insert(@Bind("name") String name, @Bind("email") String email, @Bind("phone") String phone, @Bind("aadharId") String aadharId, @Bind("panId") String panId);

    @SqlQuery("select * from article where name like :name")
    Article findByName(@Bind("name") String name);

    @SqlQuery("select * from article as a where a.uuid = :uuid and a.phone = :phone")
    Article findByUuidAndPhone(@Bind("uuid") String uuid, @Bind("phone") String phone);

    @SqlQuery("select * from article where name = :email")
    Article findByEmail(@Bind("email") String email);

    @SqlQuery("select * from article where aadhar_id = :aadharId")
    Article findByAadharId(@Bind("aadharId") String aadharId);

    @SqlQuery("select * from article where pan_id = :panId")
    Article findByPanId(@Bind("panId") String panId);

    @SqlQuery("select * from article where phone = :phone")
    Article findByPhone(@Bind("phone") String phone);

    @SqlQuery("select * from article where uuid = :uuid")
    Article findId(@Bind("uuid") String uuid);

    @SqlQuery("select * from article")
    List<Article> getAll();
}
