package kodlama.IoWeb.business.concrete;

import kodlama.IoWeb.business.abstracts.CategoryService;
import kodlama.IoWeb.core.logging.abstracts.logger.Logger;
import kodlama.IoWeb.dataAccess.abstracts.CategoryDao;
import kodlama.IoWeb.entities.concrete.Category;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;

public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    private Logger[] logger;

    public CategoryManager(CategoryDao categoryDao , Logger[] logger) {
        this.categoryDao = categoryDao;
        this.logger = logger;
    }

    @Override
    public void add(Category category) throws  Exception {
        Category category1 = new Category(1 ,"Web");

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category1);

        for(Category c : categories) {
            if (category.getCategoryName() == c.getCategoryName() )
            {
                throw  new Exception("Kategori İsmi Tekrar Edemez");

            }

            for (Logger logger : logger)
            {
                logger.log(category.getCategoryName());
            }

            categoryDao.add(category);
        }






    }
}
