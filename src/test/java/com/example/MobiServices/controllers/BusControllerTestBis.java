package com.example.MobiServices.controllers;

import com.example.MobiServices.entities.Bus;
import com.example.MobiServices.services.IBusService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by thiernosamb.
 */
@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(value = BusController.class)
class BusControllerTestBis {

    @MockBean
    IBusService iBusService;
    @InjectMocks
    BusController busController;

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(busController).build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void allBus() {
    }

    String exampleBusJson = "{\"trajet\":\"Spring\"," +
                                "\"nbPlaceByTrajet\":\"10Steps\"," +
                                "\"datDebTrajet\":\"1968-08-14T17:03:30.461Z\"," +
                                "\"prixTraje\":\"8200\"}";

    @Test
    void addBus() throws Exception {
        Bus bus = new Bus(1L,"P-P",190,null,200);

        Mockito.when(iBusService.addBus(Mockito.any(Bus.class)))
                .thenReturn(bus);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/bus/")
                .accept(MediaType.APPLICATION_JSON)
                .content(exampleBusJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        MockHttpServletResponse response = result.getResponse();

        assertEquals(HttpStatus.CREATED.value(), response.getStatus());

        assertEquals("http://localhost:8000/bus/",
                response.getHeader(HttpHeaders.LOCATION));
    }

    @Test
    void getBus() {
    }

    @Test
    void deleteBus() {
    }

}