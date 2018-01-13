package monitor.core.report;

/**
 * Created by lizhitao on 2018/1/10.
 * 监控上报处理类工厂
 */
public interface MonitorReporterFactory {
    /**
     * 创建监控上报类
     *
     * @return
     */
    MonitorReporter createMonitorReporter();
}
