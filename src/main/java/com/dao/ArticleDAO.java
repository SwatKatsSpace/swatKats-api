package com.dao;

import com.mapper.ArticleMapper;
import com.model.immutables.ImmutableArticle;
import com.model.immutables.ImmutableArticleMetadata;
import com.model.immutables.ImmutableUser;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

@RegisterRowMapper(ArticleMapper.class)
public interface ArticleDAO {

    @SqlUpdate("insert into article (name, email, phone, aadhar_id, pan_id) values (:name, :email, :phone, :aadharId, :panId)")
    Integer insert(@Bind("name") String name, @Bind("email") String email, @Bind("phone") String phone, @Bind("aadharId") String aadharId, @Bind("panId") String panId);

    @SqlQuery("select * from article where name like :name")
    ImmutableArticle findByName(@Bind("name") String name);

    @SqlQuery("select * from article where name = :email")
    ImmutableArticle findByEmail(@Bind("email") String email);

    @SqlQuery("select * from article where aadhar_id = :aadharId")
    ImmutableArticle findByAadharId(@Bind("aadharId") String aadharId);

    @SqlQuery("select * from article where pan_id = :panId")
    ImmutableArticle findByPanId(@Bind("panId") String panId);

    @SqlQuery("select * from article where phone = :phone")
    ImmutableArticle findByPhone(@Bind("phone") String phone);

    @SqlQuery("select * from article where uuid = :uuid")
    ImmutableArticle findId(@Bind("uuid") String uuid);
}
