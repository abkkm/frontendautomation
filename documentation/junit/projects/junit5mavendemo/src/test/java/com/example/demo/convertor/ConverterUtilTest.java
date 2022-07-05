package com.example.demo.convertor;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

class ConverterUtilTest {
    @TestFactory
    public Stream<DynamicTest> ensureThatCelsiumConvertsToFahrenheit() {
        ConverterUtil converter = new ConverterUtil();
        int[][] data = new int[][] { { 10,50 }, { 40, 104}, { 0, 32 } };
        return Arrays.stream(data).map(entry -> {
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return dynamicTest(celsius + " Celsius are " + fahrenheit, () -> {
                assertEquals(fahrenheit, converter.convertCelsiusToFahrenheit(celsius));
            });
        });
    }

    @TestFactory
    public Stream<DynamicTest> ensureThatFahrenheitConvertsToCelsius() {
        ConverterUtil converter = new ConverterUtil();
        int[][] data = new int[][] { { 10,50 }, { 40, 104}, { 0, 32 } };
        return Arrays.stream(data).map(entry -> {
            int celsius = entry[0];
            int fahrenheit = entry[1];
            return dynamicTest(celsius + " Celsius are " + fahrenheit, () -> {
                assertEquals(celsius, converter.convertFahrenheitToCelsius(fahrenheit));
            });
        });
    }
}