package stanford.karel;

import java.awt.*;

/**
 * An interface to represent Karel objects.
 * Used to present a common supertype between Karel and HeadlessKarel.
 */
public interface KarelInterface {
	public int getDirection();
	public int getCrystalsInBag();
	public KarelWorld getWorld();
	public Point getLocation();
	public void pause(double ms);
	public void setCrystalsInBag(int beepers);
	public void setDirection(int dir);
	public void setLocation(int x, int y);
	public void setLocation(Point pt);
	public void setWorld(KarelWorld world);

	public void run();

	public void go();
	public void left();
	public void get();
	public void put();
	public boolean frontIsClear();
	public boolean frontIsBlocked();
	public boolean leftIsClear();
	public boolean leftIsBlocked();
	public boolean rightIsClear();
	public boolean rightIsBlocked();
	public boolean crystalsOnCell();
	public boolean noCrystalsOnCell();
	public boolean crystalsInBag();
	public boolean noCrystalsInBag();
	public boolean facingNorth();
	public boolean facingEast();
	public boolean facingSouth();
	public boolean facingWest();
	public boolean notFacingNorth();
	public boolean notFacingEast();
	public boolean notFacingSouth();
	public boolean notFacingWest();
}
