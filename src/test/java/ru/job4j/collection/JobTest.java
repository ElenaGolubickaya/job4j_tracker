package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenCompatorJobAscByName() {
        Comparator<Job> cmpJobAscByName = new JobAscByName();
        int rsl = cmpJobAscByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorJobAscByPriority() {
        Comparator<Job> cmpJobAscByPriority = new JobAscByPriority();
        int rsl = cmpJobAscByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorJobDescByName() {
        Comparator<Job> cmpJobDescByName = new JobDescByName();
        int rsl = cmpJobDescByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorJobDescByPriority() {
        Comparator<Job> cmpJobDescByPriority = new JobDescByPriority();
        int rsl = cmpJobDescByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndPrority() {
        Comparator<Job> cmpDescNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpDescNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndPrority() {
        Comparator<Job> cmpAscNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAscNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}