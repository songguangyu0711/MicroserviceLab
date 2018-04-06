package com.songguangyu.MicroserviceLab;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.annotation.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.songguangyu.MicroserviceLab.*;

@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest(classes = MicroserviceLabApplication.class)
@WebAppConfiguration

public class HelloApplicationTests {
	
	 private static final String MockMvcReqeustBuilders = null;
	private MockMvc mvc;
	 
	 @Before
	 public void setUP() throws Exception{
		  mvc = MockMvcBuilders.standaloneSetup( new HelloController()).build();
	 }
 
	 @Test
	 public void hello() throws Exception {

		  mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andExpect(content().string(equalTo("Hello World")));
	 }
}
