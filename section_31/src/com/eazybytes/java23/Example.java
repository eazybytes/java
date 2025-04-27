package com.eazybytes.java23;

class Parent {
    int num;
    void display() {  }
}

class Child extends Parent {

    Child() {
        //int x = super.num;   // Error: Cannot access superclass field
        //super.display();    // Error: Cannot call superclass method

        super();
    }
}


