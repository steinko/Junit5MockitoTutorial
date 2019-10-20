package org.steinko.testtutorial.business;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(MessageController.class)
public class MessageControllerTest {
	
	@Autowired
	private MessageController controller;
	
	@Autowired
	private MockMvc mockMvc;
	
	

    @Test
    public void contextLoads() throws Exception {
		assertNotNull(controller);
		
    }
    
    @Test
    public void shouldReturnLoginPage() throws Exception {
        this.mockMvc.perform(get("/message")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello from Google Cloud")));
    }
    
    

}
