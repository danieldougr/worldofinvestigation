
/**
 * This class is responsible for controlling the tracks used in-game. 
 * @author Matheus Gouvêa and Daniel Douglas
 * @version 2021.04.05
 */

public class AudioEffects
{
    private MusicOrganizer musicOrg;
    
    /**
     * Importing the MusicOrganizer class.
     */
    public AudioEffects()
    {
        musicOrg = new MusicOrganizer();
    }
    
    /**
     * Methods that start / pause soundtracks and sound effects.
     */
    
    public void missionPassed() 
    {
        musicOrg.playTrack(0);
    }
    
    public void missionFailed() 
    {
        musicOrg.playTrack(1);
    }
    
    public void suspenseTrack() 
    {
        musicOrg.playTrack(2);
    }
    
    public void actionTrack() 
    {
        musicOrg.playTrack(3);
    }
    
    public void policeTrack()
    {
        musicOrg.playTrack(4);
    }
    
    /**
     * Pause method for sound effects / tracks.
     */
    
    public void stopTracks() 
    {
        musicOrg.stopPlaying();
    }
}
