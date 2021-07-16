package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ValidateInputTest {

    @Test
    public void whenValidateInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidateInput1() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "1"});
        ValidateInput input = new ValidateInput(out,in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(0));
    }
    @Test
    public void whenValidateInput2() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"-1", "1"});
        ValidateInput input = new ValidateInput(out,in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-1));
    }
}