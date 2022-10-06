package kodlama.IoWeb.dataAccess.concrete.hibernate;

import kodlama.IoWeb.dataAccess.abstracts.CategoryDao;
import kodlama.IoWeb.entities.concrete.Category;

public class HibernateCategoryDao implements CategoryDao {


    Category category1 = new Category();




    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + ": Kategorisi Hibernate İle Eklendi");
    }
}
