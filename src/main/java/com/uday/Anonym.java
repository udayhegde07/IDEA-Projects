package com.uday;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Anonym
{
    private String name;
    private int point;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }
    public int getPoint()
    {
        return point;
    }

    @Override
    public String toString() {
        return "Anonym{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", id='" + id + '\'' +
                '}';
    }
}