public class ConcreteReaderCreator extends BaseLogReaderCreator{
    
    @Override
    protected LogReader createLogReaderInstance(LogType logType){

        return switch (logType){
            case Poem -> new PoemReader();
            case Text -> new TextFileReader();
            case Database -> new DatabaseReader();
            case System -> OperationSystemLogEventReader();
        }
    }

    private Object OperationSystemLogEventReader() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'OperationSystemLogEventReader'");
    }

    public LogReader createLogReader(LogType poem, String data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createLogReader'");
    }
}