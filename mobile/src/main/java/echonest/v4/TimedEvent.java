package echonest.v4;

import java.util.Map;

import echonest.v4.util.MQuery;

public class TimedEvent {

    private double start;
    private double duration;
    private double confidence;

    TimedEvent(Map map) {
        MQuery mq = new MQuery(map);
        start = mq.getDouble("start");
        duration = mq.getDouble("duration");
        confidence = mq.getDouble("confidence");
    }

    /**
     * @return the start
     */
    public double getStart() {
        return start;
    }

    /**
     * @return the duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     * @return the confidence
     */
    public double getConfidence() {
        return confidence;
    }

    @Override
    public String toString() {
        return String.format("%.2f %.2f %.2f", start, duration, confidence);
    }
}
