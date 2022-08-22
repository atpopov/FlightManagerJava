package flight.werkzeuge.beobachter;

import java.util.HashSet;
import java.util.Set;

public abstract class Listening
{

    //Set with all Listeners(Beobachter).
    private Set<Listener> _allListeners;

    public Listening()
    {
        _allListeners = new HashSet<Listener>();
    }

    /**
     * Adds a new Listener in the set. 
     * 
     * @require listener != null
     */
    public void registerListener(Listener listener)
    {
        assert listener != null : "Vorbedingung verletzt: listener != null";

        _allListeners.add(listener);
    }

    /**
     * Removes a Listener from the Set.
     * 
     * @param beobachter
     */
    public void removeBeobachter(Listener listener)
    {
        _allListeners.remove(listener);
    }

    /**
     * Informs all Listeners when a change is made.
     */
    public void informAboutChange()
    {
        for (Listener l : _allListeners)
        {
            l.reactOnChange();
        }
    }
}
