package com.segroup9.storyplay;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Array;

public class StoryPage {

    String name = "";
    String narration;
    Array<StoryActorDef> actorDefs;

    public StoryPage() {
        actorDefs = new Array<>();
    }

    public void add(Actor actor) {
        StoryActorDef actorDef = ((StoryActorDef)actor.getUserObject());
        if (actorDef == null)
            actorDefs.add(new StoryActorDef(actor));
        else {
            actorDef.getActorProps(actor);
            actorDefs.add(actorDef);
        }
    }
}
