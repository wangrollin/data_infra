package io.wangrollin.data_infra;

import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;

public class File2Console {

    public static void main(String[] args) throws Exception {

        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        DataSource<String> lineDS = env.readTextFile("data_task/flink_task/flink_1_17_task/input/word.txt");

        lineDS.print();
    }
}