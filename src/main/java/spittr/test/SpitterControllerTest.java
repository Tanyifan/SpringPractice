package spittr.test;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.Spitter;
import spittr.data.SpitterRepository;
import spittr.web.SpitterController;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/14
 */
public class SpitterControllerTest {
    @Test
    public void showRegistrationForm() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/spitter/register")).andExpect(MockMvcResultMatchers.view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception{
        SpitterRepository repository = Mockito.mock(SpitterRepository.class);
        Spitter unsaved = new Spitter("123","123","123","123");
        Spitter saved = new Spitter(24L,"123","123","123","123");
        Mockito.when(repository.save(unsaved)).thenReturn(saved);
        SpitterController controller = new SpitterController(repository);
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/spitter/register")
                .param("userName","123")
                .param("firstName","123")
                .param("password","123")
                .param("lastName","123")).andExpect(redirectedUrl("/spitter/123"));
        Mockito.verify(repository,Mockito.atLeastOnce()).save(unsaved);

    }
}
