/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tournamentofchampions;

/**
 *
 * @author Isaiah
 */
import java.util.Date;

public class StopWatch {

    private long startTime;
    private long endTime;

    java.util.Date time = new java.util.Date();

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    } 

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
       this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return (endTime - startTime);
    }

}
