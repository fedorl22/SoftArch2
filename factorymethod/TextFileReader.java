public class TextFileReader extends LogReader {

    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSourse(Object data) {

    }

    @Override
    protected Iterable<String> readEntries(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntry(String stringEntry) {
        
    }

    @Override
    public void setDataSource(Object data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDataSource'");
    }

    @Override
    protected LogEntry parseEntry(String stringEntry) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parseEntry'");
    }
}