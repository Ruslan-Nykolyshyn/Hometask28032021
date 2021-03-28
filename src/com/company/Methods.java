package com.company;

import java.io.*;

public class Methods  {
    public void serialize(Object o) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("kcjscjcl");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(o);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object was serialized!");

    }
    public  Object deserialize() throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("jd jhdjh b");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);

        Object object = objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();
        System.out.println("Object was Deserialized!");

        return object;


    }
}
