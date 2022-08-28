package com.abkkm.reactive.service;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.abkkm.reactive.dto.ProductDto;
import com.abkkm.reactive.entity.Product;
import com.abkkm.reactive.repository.ProductRepository;

import java.util.function.Function;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Range;
import org.springframework.http.server.RequestPath;
import org.springframework.http.server.reactive.ChannelSendOperator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Mono;
import reactor.core.publisher.ReplayProcessor;

@ContextConfiguration(classes = {ProductService.class})
@ExtendWith(SpringExtension.class)
class ProductServiceTest {
    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    /**
     * Method under test: {@link ProductService#deleteProduct(String)}
     */
    @Test
    void testDeleteProduct() {
        ChannelSendOperator<Object> channelSendOperator = new ChannelSendOperator<>(
                (Publisher<Object>) mock(Publisher.class), (Function<Publisher<Object>, Publisher<Void>>) mock(Function.class));

        when(productRepository.deleteById((String) any())).thenReturn(channelSendOperator);

        ServerRequest serverRequest;

        RequestPath

        serverRequest.headers().asHttpHeaders()

        assertSame(channelSendOperator, productService.deleteProduct("42"));
        verify(productRepository).deleteById((String) any());
    }

    /**
     * Method under test: {@link ProductService#getProduct(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "reactor.core.publisher.Mono.map(java.util.function.Function)" because the return value of "com.abkkm.reactive.repository.ProductRepository.findById(Object)" is null
        //       at com.abkkm.reactive.service.ProductService.getProduct(ProductService.java:25)
        //   In order to prevent getProduct(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProduct(String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(productRepository.findById((String) any())).thenReturn(null);
        productService.getProduct("42");
    }

    /**
     * Method under test: {@link ProductService#getProduct(String)}
     */
    @Test
    void testGetProduct2() {
        when(productRepository.findById((String) any())).thenReturn((Mono<Product>) mock(Mono.class));
        productService.getProduct("42");
        verify(productRepository).findById((String) any());
    }

    /**
     * Method under test: {@link ProductService#getProductInRange(double, double)}
     */
    @Test
    void testGetProductInRange() {
        DirectProcessor<ProductDto> createResult = DirectProcessor.create();
        when(productRepository.findByPriceBetween((Range<Double>) any())).thenReturn(createResult);
        assertSame(createResult, productService.getProductInRange(10.0d, 10.0d));
        verify(productRepository).findByPriceBetween((Range<Double>) any());
    }

    /**
     * Method under test: {@link ProductService#getProducts()}
     */
    @Test
    void testGetProducts() {
        when(productRepository.findAll()).thenReturn(DirectProcessor.create());
        productService.getProducts();
        verify(productRepository).findAll();
    }

    /**
     * Method under test: {@link ProductService#getProducts()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProducts2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "reactor.core.publisher.Flux.map(java.util.function.Function)" because the return value of "com.abkkm.reactive.repository.ProductRepository.findAll()" is null
        //       at com.abkkm.reactive.service.ProductService.getProducts(ProductService.java:21)
        //   In order to prevent getProducts()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProducts().
        //   See https://diff.blue/R013 to resolve this issue.

        when(productRepository.findAll()).thenReturn(null);
        productService.getProducts();
    }

    /**
     * Method under test: {@link ProductService#getProducts()}
     */
    @Test
    void testGetProducts3() {
        when(productRepository.findAll()).thenReturn(ReplayProcessor.create(3, true));
        productService.getProducts();
        verify(productRepository).findAll();
    }

    /**
     * Method under test: {@link ProductService#saveProduct(Mono)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "reactor.core.publisher.Mono.map(java.util.function.Function)" because "productDtoMono" is null
        //       at com.abkkm.reactive.service.ProductService.saveProduct(ProductService.java:34)
        //   In order to prevent saveProduct(Mono)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   saveProduct(Mono).
        //   See https://diff.blue/R013 to resolve this issue.

        productService.saveProduct(null);
    }

    /**
     * Method under test: {@link ProductService#saveProduct(Mono)}
     */
    @Test
    void testSaveProduct2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by saveProduct(Mono)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        productService.saveProduct((Mono<ProductDto>) mock(Mono.class));
    }

    /**
     * Method under test: {@link ProductService#updateProduct(Mono, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "reactor.core.publisher.Mono.flatMap(java.util.function.Function)" because the return value of "com.abkkm.reactive.repository.ProductRepository.findById(Object)" is null
        //       at com.abkkm.reactive.service.ProductService.updateProduct(ProductService.java:41)
        //   In order to prevent updateProduct(Mono, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateProduct(Mono, String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(productRepository.findById((String) any())).thenReturn(null);
        productService.updateProduct(null, "42");
    }

    /**
     * Method under test: {@link ProductService#updateProduct(Mono, String)}
     */
    @Test
    void testUpdateProduct2() {
        when(productRepository.findById((String) any())).thenReturn((Mono<Product>) mock(Mono.class));
        productService.updateProduct(null, "42");
        verify(productRepository).findById((String) any());
    }
}

