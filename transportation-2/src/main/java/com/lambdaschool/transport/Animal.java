package com.lambdaschool.transport;

public interface Animal // by convention in interfaces we let things default. it's why we don't have private or public
{
    void move();
    void eat(int i);
    String speak();

}

// interfaces allows us to control what we mean by an Animal
