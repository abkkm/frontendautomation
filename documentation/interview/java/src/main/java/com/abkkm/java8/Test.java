package com.abkkm.java8;

import com.abkkm.collection.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Test {
    public static void main(String[] args) {
        /*MyFunc myMethod = (i) -> {System.out.println("test ..")};
        myMethod.myMethod1(2);*/

       // MyFunc myMethodd;
        //myMethodd = (i) -> i*10;
        //System.out.println("myMethod2-"+myMethodd.myMethod2(2));


        MyFunc myString = ( s1,  s2) -> {
            return s1+s2;
        };

        System.out.println("Added String-"+myString.test("First", "Second"));

        Function<Integer, String> fun = (t) -> "out-"+t;
        System.out.println(fun.apply(100));

        List<Integer> list = Arrays.asList(23,4,8,1,2,10);
        //>4 23,8,20
        //8,20,23
        //
        //
        Predicate<Integer> predicate = t -> t>4;
        //list.stream().filter(predicate); //or
        //list.stream().filter(t->t>4).sorted().forEach(t->System.out.println(t));
        list.stream().filter(t->t>4).sorted().forEach(System.out::println);
        list.stream().filter(t->t>4).sorted().forEach(Test::printElement);

        Test test = new Test();
        list.stream().filter(t->t>4).sorted().forEach(test::printElementt);

        // Creating an Stream
        Stream stream = Stream.of("Geeks", "for", "Geeks");
        // Displaying the sequential ordered stream
        stream.forEach(System.out::println);

        Student s1 = new Student(101, "Basant", "223232323", Arrays.asList("1@gmail.com", "2@gmail.com"));
        Student s2 = new Student(109, "Santosh", "111122323", Arrays.asList("1@gmail.com", "2@gmail.com"));


        List<Student> students = Stream.of(s1, s2)
                .collect(Collectors.toList());


        List<String> phoneNumbers = students.stream().map(Student::getPhone).collect(Collectors.toList());

        System.out.println(phoneNumbers); // Prints all phonenumbers

        List<List<String>> emails = students.stream().map(Student::getEmail).collect(Collectors.toList());

        System.out.println(emails); // Prints all emails

        List<String> stringList = students.stream().flatMap(s -> s.getEmail().stream()).collect(Collectors.toList());

        System.out.println(stringList); // Prints all emails

        String input = "Basanta";

        Map<String, Long> countMap = Arrays.stream(input.split("")).collect(groupingBy(Function.identity(),counting()
        ));

        System.out.println(countMap);

        //approach 1 - Highest paid salary in each dept

        //approach 1

        //Comparator<Employee> compareBySalary = Comparator.comparing(Employee::getSalary);

        //Map<String, Optional<Employee>> employeeMap = employess.stream().collect(groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(compareBySalary))));

        //System.out.pirnln(emploeeMap);

        //approach 2

        //Map<String, Employee> employeeMap1 = employess.stream().collect(groupingBy(Employee::getDept,Collectors.collectingAndThen(maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

        //system.out.pirnln(emploeeMap1);



    }

    public static void printElement(int i){
        System.out.println(i);
    }
    public  void printElementt(int i){
        System.out.println(i);
    }
}
