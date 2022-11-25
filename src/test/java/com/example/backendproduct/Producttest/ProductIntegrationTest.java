package com.example.backendproduct.Producttest;
import com.example.backendproduct.Account.Account;
import com.example.backendproduct.Product.ProductController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.backendproduct.Product.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(ProductController.class)
public class ProductIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService service;

    @Test
    public void getAllProductsTestList() throws Exception {
        List<Product> products = new ArrayList<>();
        Account account = new Account();
        Product product1 = new Product(1L, "Tonno", "Tonno", 13.00, account);
        Product product2 = new Product(2L, "Salami", "Salami", 14.90, account);
        products.add(product1);
        products.add(product2);

        Mockito.when(service.getAllProducts())
                .thenReturn(products);

        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/api/v1/product"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Tonno"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].ingredients").value("Tonno"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].price").value(13.00))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].id").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].name").value("Salami"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].ingredients").value("Salami"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[1].price").value(14.90));
    }

    @Test
    public void deleteproduct() throws Exception {

        mockMvc.perform(delete("/api/v1/product/{id}", 1L))
                .andDo(print()).andExpect(status().isOk());

    }
}
