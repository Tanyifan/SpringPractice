package spittr.test;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.Spittle;
import spittr.data.SpittleRepository;
import spittr.web.SpittleController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/13
 */
public class SpittleControllerTest {
//    @Test
//    public void shouldShowRecentSpittles() throws Exception {
//        List<Spittle> expectedSpittles = createSpittleList(20);
//        SpittleRepository repository = Mockito.mock(SpittleRepository.class);
//        Mockito.when(repository.findSpittles(Long.MAX_VALUE,20)).thenReturn(expectedSpittles);
//        SpittleController controller = new SpittleController(repository);
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).setSingleView(new InternalResourceView("webapp/WEB-INF/views/spittles.jsp")).build();
//        mockMvc.perform(get("/spittles"))
//                .andExpect(MockMvcResultMatchers.view().name("spittles"))
//                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
//                .andExpect(MockMvcResultMatchers.model().attribute("spittleList", Matchers.hasItem(expectedSpittles.toArray())));
//    }

    private List<Spittle> createSpittleList(int i) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for(int c=0;c<i;c++){
            spittles.add(new Spittle("Spittle "+c,new Date()));
        }
        return spittles;
    }

//    @Test
//    public void shouldShowPagedSpittles() throws Exception {
//        List<Spittle> expectedSpittles = createSpittleList(50);
//        SpittleRepository repository = Mockito.mock(SpittleRepository.class);
//        Mockito.when(repository.findSpittles(238900,20)).thenReturn(expectedSpittles);
//        SpittleController controller = new SpittleController(repository);
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).setSingleView(new InternalResourceView("webapp/WEB-INF/views/spittles.jsp")).build();
//        mockMvc.perform(get("/spittles/?max=238900&count=50"))
//                .andExpect(MockMvcResultMatchers.view().name("spittles"))
//                .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
//                .andExpect(MockMvcResultMatchers.model().attribute("spittleList", Matchers.hasItem(expectedSpittles.toArray())));
//    }

    @Test
    public void testSpittle() throws Exception{
        Spittle expectedSpittle = new Spittle("Hello",new Date());
        SpittleRepository repository = Mockito.mock(SpittleRepository.class);
        Mockito.when(repository.findOne(12345)).thenReturn(expectedSpittle);

        SpittleController controller = new SpittleController(repository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles/12345"))
                .andExpect(MockMvcResultMatchers.view().name("spittle"))
                .andExpect(MockMvcResultMatchers.model().attributeExists("spittle"))
                .andExpect(MockMvcResultMatchers.model().attribute("spittle", Matchers.hasItem(expectedSpittle)));

    }

}
