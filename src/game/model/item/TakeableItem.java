package game.model.item;

import game.model.game_world.Location;

public abstract class TakeableItem extends Item {

    public TakeableItem(Location location) {
        super(location);
    }
}
