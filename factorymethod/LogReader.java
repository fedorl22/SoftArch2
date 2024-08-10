import java.util.ArrayList;
import java.util.List;

public abstract class LogReader {

    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void getCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEntry> readLogEntry() {
        List<LogEntry> logList = new ArrayList<>();
        for (String str : readEntries(currentPosition)) {
          logList.add(parseEntry(str));        
    } 
        return logList;       
    }

    public abstract Object getDataSource();
    public abstract void setDataSource(Object data);
    protected abstract Iterable<String> readEntries(Integer position);
    protected abstract LogEntry parseEntry(String stringEntry);

}