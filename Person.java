public class Person{

private String name;
private String lastName;
private int age;


Person(){

}

Person(String name, String lastName, int age){

    this.name = name;
    this.lastName = lastName;
    this.age = age;

}


public void setName(String name){

    this.name = name;

}

public String getName(){

return this.name;

}

public void setLastName(String lastName){

this.lastName = lastName;

}

public String getLastName(){

return this.lastName;
}


public void setAge(int age){

    this.age = age;
}


public int getAge(){

    return this.age;
}





}