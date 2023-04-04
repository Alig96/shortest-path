package shortestpath;

import net.runelite.client.callback.ClientThread;

public interface ShortestPathPluginInterface {
    ClientThread getClientThread();
    boolean isStartPointSet();
}
