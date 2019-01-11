package com.jdbi.dao;

import com.jdbi.mapper.ArticleMapper;
import com.model.Article;
import org.jdbi.v3.sqlobject.config.RegisterRowMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import ru.vyarus.guicey.jdbi3.installer.repository.JdbiRepository;
import ru.vyarus.guicey.jdbi3.tx.InTransaction;

import java.util.List;
import java.util.UUID;

@JdbiRepository
@InTransaction
@RegisterRowMapper(ArticleMapper.class)
public interface ArticleDAO {

//    @SqlQuery("select * from article where name like :name")
//    Article findByName(@Bind("name") String name);
//
//    @SqlQuery("select * from article as a where a.uuid = :uuid and a.phone = :phone")
//    Article findByUuidAndPhone(@Bind("uuid") String uuid, @Bind("phone") String phone);
//
//    @SqlQuery("select * from article where name = :email")
//    Article findByEmail(@Bind("email") String email);
//
//    @SqlQuery("select * from article where aadhar_id = :aadharId")
//    Article findByAadharId(@Bind("aadharId") String aadharId);
//
//    @SqlQuery("select * from article where pan_id = :panId")
//    Article findByPanId(@Bind("panId") String panId);
//
//    @SqlQuery("select * from article where phone = :phone")
//    Article findByPhone(@Bind("phone") String phone);
//
//    @SqlQuery("select * from article where uuid = :uuid")
//    Article findId(@Bind("uuid") String uuid);

    @SqlQuery("select uuid, firstName, lastName, email, phone, aadhar_id as \"aadharId\", pan_id as \"panId\", image, relation, description, likes from article")
    List<Article> getArticleList();

    @SqlQuery("select uuid, firstName, lastName, email, phone, aadhar_id as \"aadharId\", pan_id as \"panId\", image, relation, description, likes from article where uuid = :uuid")
    Article getArticleByUuid(@Bind("uuid") UUID uuid);


    @SqlQuery("INSERT INTO article (firstName, lastName, email, phone, aadhar_id, pan_id, image, relation, description, likes) " +
            "VALUES (:firstName, :lastName, :email, :phone, :aadharId, :panId, :image, :relation, :discription, :likes)")
    Integer addNewArticle(@Bind("firstName") String firstName,
                          @Bind("lastName") String lastName,
                          @Bind("email") String email,
                          @Bind("phone") String phone,
                          @Bind("aadharId") String aadharId,
                          @Bind("panId") String panId,
                          @Bind("image") String image,
                          @Bind("relation") String relation,
                          @Bind("discription") String discription,
                          @Bind("likes") String likes);
}
