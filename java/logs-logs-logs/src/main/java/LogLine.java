public class LogLine {

    private static final String TRC = "TRC";
    private static final String DBG = "DBG";
    private static final String INF = "INF";
    private static final String WRN = "WRN";
    private static final String ERR = "ERR";
    private static final String FTL = "FTL";

    private final String logLine;

    private final String shortLogLine;

    private final LogLevel logLevel;

    public LogLine(String logLine) {

        switch (logLine.substring(1, 4)) {
            case TRC:
                logLevel = LogLevel.TRACE;
                break;
            case DBG:
                logLevel = LogLevel.DEBUG;
                break;
            case INF:
                logLevel = LogLevel.INFO;
                break;
            case WRN:
                logLevel = LogLevel.WARNING;
                break;
            case ERR:
                logLevel = LogLevel.ERROR;
                break;
            case FTL:
                logLevel = LogLevel.FATAL;
                break;
            default:
                logLevel = LogLevel.UNKNOWN;
        }

        this.logLine = logLine;

        String[] data = this.logLine.split(": ");
        this.shortLogLine = this.logLevel.getValue() + ":" + data[1];
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return this.shortLogLine;
    }
}
