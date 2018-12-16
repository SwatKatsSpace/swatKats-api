package com.resources;

//@Path("/swatkats/article")
//@Produces(MediaType.APPLICATION_JSON)
public class ArticleResource {

//    private final ArticleDAO articleDAO;
//    private final ArticleDetailsDAO articleDetailsDAO;
//    private final ArticleFinanceDetailsDAO articleFinanceDetailsDAO;
//    private final ArticleMetadataDAO articleMetadataDAO;
//    private final Jdbi jdbi;
//
//    public ArticleResource(Jdbi jdbi, ArticleDAO articleDAO, ArticleDetailsDAO articleDetailsDAO, ArticleFinanceDetailsDAO articleFinanceDetailsDAO, ArticleMetadataDAO articleMetadataDAO) {
//        this.jdbi = jdbi;
//        this.articleDAO = articleDAO;
//        this.articleDetailsDAO = articleDetailsDAO;
//        this.articleFinanceDetailsDAO = articleFinanceDetailsDAO;
//        this.articleMetadataDAO = articleMetadataDAO;
//    }
//
//    @Path("/add")
//    @POST
//    public Integer insertUser(User user) {
//        return articleDAO.insert(user.name(), user.email(), user.phone().get(), user.aadharId(), user.panId());
//    }
//
//    public Integer insertUserDetails(String uuid, String phone) {
//        //Optional uuidOptional = Optional.of()
//        articleDAO.findByUuidAndPhone(uuid, phone);
//        return null;
//    }
//
//
//    @Path("/get")
//    @GET
//    public List<Article> getUser() {
//        List<Article> articles = articleDAO.getAll();
//        return articles;
//    }
}
