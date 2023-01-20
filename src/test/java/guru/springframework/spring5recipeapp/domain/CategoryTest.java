package guru.springframework.spring5recipeapp.domain;


import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class CategoryTest {

    Category category;

    @Before
    public void setUp() throws Exception {
        category = new Category();

    }
    @Test
    public void getId() throws Exception{
        Long idValue= 3L;
        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
   public  void getDescription() throws Exception{
        String desValue= "testy food";
        category.setDescription(desValue);

        assertEquals(desValue,category.getDescription());
    }

    @Test
   public  void getRecipes() throws Exception{
    }
}