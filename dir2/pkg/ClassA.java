package pkg;

import pkg.ClassB;


public class ClassA {
    int xyz(ClassB b) {
    }

    public void main(String[] args) {
        System.out.println("testing..");
        xyz(new ClassB());
    }
}

