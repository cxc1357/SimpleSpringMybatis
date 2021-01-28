package test;

import mapper.CategoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringMybatisTest {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void testAdd(){
        Category category = new Category();
        category.setName("new Category");
        categoryMapper.add(category);
    }
}
