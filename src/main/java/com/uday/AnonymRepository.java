package com.uday;

import java.util.ArrayList;
import java.util.List;

public class AnonymRepository
{
    List<Anonym> anonymsList;
    public void create(Anonym an)
    {
        anonymsList.add(an);
    }
    public AnonymRepository()
    {
        anonymsList = new ArrayList<Anonym>();

        Anonym an = new Anonym();
        an.setId("ID01");
        an.setName("Uday");
        an.setPoint(20);

        Anonym an2 = new Anonym();
        an.setId("ID02");
        an2.setName("Sam");
        an2.setPoint(30);

        anonymsList.add(an);
        anonymsList.add(an2);
    }

    public List<Anonym> getAnonymsList()
    {
        return this.anonymsList;
    }

    public Anonym getAnonym(String id)
    {
        for(Anonym a:this.anonymsList)
        {
            if(a.getId().equals(id))
            {
                return a;
            }
        }

        return null;
    }
}
