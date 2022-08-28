package com.abkkm.reactive.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

class ProductControllerTest {
    /**
     * Method under test: {@link ProductController#deleteProduct(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.abkkm.reactive.service.ProductService.deleteProduct(String)" because "this.service" is null
        //       at com.abkkm.reactive.controller.ProductController.deleteProduct(ProductController.java:45)
        //   In order to prevent deleteProduct(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   deleteProduct(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ProductController()).deleteProduct("42");
    }

    /**
     * Method under test: {@link ProductController#getProduct(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.abkkm.reactive.service.ProductService.getProduct(String)" because "this.service" is null
        //       at com.abkkm.reactive.controller.ProductController.getProduct(ProductController.java:24)
        //   In order to prevent getProduct(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProduct(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ProductController()).getProduct("42");
    }

    /**
     * Method under test: {@link ProductController#getProductBetweenRange(double, double)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProductBetweenRange() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.abkkm.reactive.service.ProductService.getProductInRange(double, double)" because "this.service" is null
        //       at com.abkkm.reactive.controller.ProductController.getProductBetweenRange(ProductController.java:29)
        //   In order to prevent getProductBetweenRange(double, double)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProductBetweenRange(double, double).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ProductController()).getProductBetweenRange(10.0d, 10.0d);
    }

    /**
     * Method under test: {@link ProductController#getProducts()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetProducts() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.abkkm.reactive.service.ProductService.getProducts()" because "this.service" is null
        //       at com.abkkm.reactive.controller.ProductController.getProducts(ProductController.java:19)
        //   In order to prevent getProducts()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getProducts().
        //   See https://diff.blue/R013 to resolve this issue.

        (new ProductController()).getProducts();
    }

    /**
     * Method under test: {@link ProductController#saveProduct(Mono)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSaveProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.abkkm.reactive.service.ProductService.saveProduct(reactor.core.publisher.Mono)" because "this.service" is null
        //       at com.abkkm.reactive.controller.ProductController.saveProduct(ProductController.java:35)
        //   In order to prevent saveProduct(Mono)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   saveProduct(Mono).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ProductController()).saveProduct(null);
    }

    /**
     * Method under test: {@link ProductController#updateProduct(Mono, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdateProduct() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.abkkm.reactive.service.ProductService.updateProduct(reactor.core.publisher.Mono, String)" because "this.service" is null
        //       at com.abkkm.reactive.controller.ProductController.updateProduct(ProductController.java:40)
        //   In order to prevent updateProduct(Mono, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   updateProduct(Mono, String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new ProductController()).updateProduct(null, "42");
    }
}

