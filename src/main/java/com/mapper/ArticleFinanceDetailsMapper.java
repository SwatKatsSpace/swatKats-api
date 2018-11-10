package com.mapper;

import com.model.immutables.ImmutableArticleFinanceDetails;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticleFinanceDetailsMapper implements RowMapper<ImmutableArticleFinanceDetails> {
    @Override
    public ImmutableArticleFinanceDetails map(ResultSet rs, StatementContext ctx) throws SQLException {
        return ImmutableArticleFinanceDetails.builder()
                .bankAccountNumber(rs.getString("bank_account_number"))
                .bankName(rs.getString("bank_name"))
                .ifscCode(rs.getString("ifsc_code"))
                .nameOnAccount(rs.getString("name_on_account"))
                .build();
    }
}
