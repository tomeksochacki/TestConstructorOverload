package test;

public class TestConstructorOverload {
    private int age;
    private int height;
    private String name;
    private int number;

    public TestConstructorOverload(int age){
        this.age = age;

    }
    public TestConstructorOverload(int age,int height){
        this(age);
        this.height = height;
    }
    public TestConstructorOverload(String name, int number){
        this.name = name;
        this.number = number;
    }
    public TestConstructorOverload(int age, int height, String name, int number){
        this(age);
        this.height = height;
        this.name = name;
        this.number = number;
    }



}
