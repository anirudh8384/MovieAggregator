package MovieAggregator;

import java.util.*;


public abstract class writer{
    public abstract void write(Map<Integer,List<String>> data, String fileName);
}
