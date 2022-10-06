package kodlama.IoWeb.dataAccess.concrete.jdbc;

import kodlama.IoWeb.dataAccess.abstracts.CategoryDao;
import kodlama.IoWeb.entities.concrete.Category;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() +  ": Jdbc ile eklendi");
    }
}
