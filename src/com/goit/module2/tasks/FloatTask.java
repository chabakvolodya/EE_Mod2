package com.goit.module2.tasks;

import com.goit.module2.api.Task;

/**
 * Created by Администратор on 27.04.2016.
 */
public class FloatTask implements Task<Float> {

    private Float value;
    private Float result;

    public FloatTask(Float value) {
        this.value = value;
    }

    @Override
    public void execute() {
        result = value;
    }

    @Override
    public Float getResult() {
        return result;
    }
}
