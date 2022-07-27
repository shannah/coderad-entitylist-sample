package com.example.myapp.models;

import com.codename1.rad.annotations.RAD;
import com.codename1.rad.models.Entity;
import com.codename1.rad.models.Tag;
import com.codename1.rad.schemas.Person;

@RAD
public interface UserProfile extends Entity {

    /*
     * Declare the tags that we will use in our model. (2)
     */
    public static final Tag name = Person.name;
    public static final Tag photoUrl = Person.thumbnailUrl;
    public static final Tag email = Person.email;

    @RAD(tag="name")
    String getName();
    void setName(String name);

    @RAD(tag="photoUrl")
    String getPhotoUrl();
    void setPhotoUrl(String url);

    @RAD(tag="email")
    String getEmail();
    void setEmail(String email);
}