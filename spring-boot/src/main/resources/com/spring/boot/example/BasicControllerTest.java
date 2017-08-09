package com.spring.boot.example;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@RunWith(SpringRunner.class)
@WebMvcTest(BasicControllerTest.class)
public class BasicControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void welcome() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/welcome").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(content().string(equalTo("Hello World")));
    }
}
