package org.example;

public class WriteLogs {
    public static void LogTestSteps(String TestLog) throws Exception {
        if (TestLog.isEmpty() || TestLog != null) {
            System.out.println(TestLog);
        } else throw new Exception("Test Log Cannot Be Empty or Null");
    }
}
