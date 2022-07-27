package com.example.myapp.providers;

import com.codename1.rad.models.AbstractEntityListProvider;
import com.codename1.rad.models.EntityList;
import com.example.myapp.models.UserProfile;
import com.example.myapp.models.UserProfileImpl;

public class SampleListProvider extends AbstractEntityListProvider {

    @Override
    public Request getEntities(Request request) {
        EntityList out = new EntityList();
        {
            UserProfile profile = new UserProfileImpl();
            profile.setName("Steve Hannah");
            profile.setEmail("steve@example.com");
            out.add(profile);
        }
        {
            UserProfile profile = new UserProfileImpl();
            profile.setName("Shai Almog");
            profile.setEmail("shai@example.com");
            out.add(profile);
        }
        {
            UserProfile profile = new UserProfileImpl();
            profile.setName("Chen Fishbein");
            profile.setEmail("chen@example.com");
            out.add(profile);
        }
        request.complete(out);
        return request;
    }

}