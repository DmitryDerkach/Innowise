package org.innowise.practice_tasks.thread;

public class Main {
    public static void main(String[] args) {
        int activeThreadsFromStackTraces = Thread.getAllStackTraces().size();
        System.out.println("Active threads from getAllStackTraces: " + activeThreadsFromStackTraces);
        
        /*List all active threads with details*/
        System.out.println("\nDetailed thread information:");
        Thread.getAllStackTraces().keySet().forEach(thread -> {
            System.out.println("Thread: " + thread.getName() + 
                             ", Group: " + thread.getThreadGroup().getName() + 
                             ", State: " + thread.getState() +
                             ", Daemon: " + thread.isDaemon());
        });
        
        /*Alternative: Count only non-daemon threads (typically application threads)*/
        long nonDaemonThreads = Thread.getAllStackTraces().keySet().stream()
            .filter(thread -> !thread.isDaemon())
            .count();
        System.out.println("\nNon-daemon threads count: " + nonDaemonThreads);
        
        /*Count threads in the same group as main thread*/
        String mainGroupName = Thread.currentThread().getThreadGroup().getName();
        long threadsInMainGroup = Thread.getAllStackTraces().keySet().stream()
            .filter(thread -> thread.getThreadGroup().getName().equals(mainGroupName))
            .count();
        System.out.println("Threads in main thread group '" + mainGroupName + "': " + threadsInMainGroup);
    }
}
