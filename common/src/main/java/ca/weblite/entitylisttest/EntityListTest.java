package ca.weblite.entitylisttest;

import static com.codename1.rad.util.NonNull.with;
import static com.codename1.ui.CN.*;

import com.codename1.rad.controllers.ControllerEvent;
import com.codename1.ui.*;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.*;
import com.codename1.io.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.util.Resources;
import com.codename1.rad.controllers.ApplicationController;
import com.example.myapp.models.UserProfile;
import com.example.myapp.providers.SampleListProvider;

/**
 * This file was generated by <a href="https://www.codenameone.com/">Codename One</a> for the purpose 
 * of building native mobile applications using Java.
 */
public class EntityListTest extends ApplicationController {

    @Override
    protected void initControllerActions() {
        super.initControllerActions();
        addAction(StartPage.ROW_CLICKED, evt-> {
            evt.consume();
            UserProfile profile = (UserProfile)evt.getEntity();
            Dialog.show("Hello", "You clicked " + profile.getName(), "OK", null);
        });
    }

    public void actionPerformed(ControllerEvent evt) {
        with(evt, StartEvent.class, startEvent -> {
            if (!startEvent.isShowingForm()) {
                startEvent.setShowingForm(true);
                new StartPageController(this).show();
            }
        });

        super.actionPerformed(evt);
    }

    @Override
    protected void onStartController() {
        super.onStartController();
        addLookup(new SampleListProvider());
    }
}