package kodlama.IoWeb.business.abstracts;

import kodlama.IoWeb.dataAccess.abstracts.CategoryDao;
import kodlama.IoWeb.entities.concrete.Category;

public interface CategoryService {
    void add(Category category) throws  Exception;

}
