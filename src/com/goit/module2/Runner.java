package com.goit.module2;

import com.goit.module2.api.Executor;
import com.goit.module2.api.Task;
import com.goit.module2.tasks.FloatTask;
import com.goit.module2.tasks.IntegerTask;
import com.goit.module2.tasks.LongTask;

/**
 * Created by Администратор on 20.04.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Executor<Number> numberExecutor = new ExecutorImplements<>();

        IntegerTask integerTask = new IntegerTask(45);
        IntegerTask integerTask1 = new IntegerTask(6);
        FloatTask floatTask = new FloatTask(4.55F);
        FloatTask floatTask1 = new FloatTask(7.7125F);


        numberExecutor.addTask(integerTask);
        numberExecutor.addTask(floatTask, new NumberValidator());

        numberExecutor.addTask(floatTask1);
        numberExecutor.addTask(integerTask1, new NumberValidator());


        numberExecutor.execute();


        System.out.println("TRUE" + numberExecutor.getValidResults());
        System.out.println("FALSE" + numberExecutor.getInvalidResults());
    }
}
