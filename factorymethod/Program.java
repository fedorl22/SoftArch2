public class Program {
    public static String data = """
У лукоморья дуб зеленый;
Златая цепь на дубе том:
И днем и ночью кот ученый
Все ходит по цепи кругом;
Идет на прво - песнь заводит,
Налево - скзку говорит. """ ;

    public static void main (String[] args) {
        LogReader logReader = new ConcreteReaderCreator()
                .createLogReader(LogType.Poem, data);
        for (LogEntry log : logReader.readLogEntry()) {
            System.out.println(log.getText());
        }
    }


}