package ru.job4j.tracker;

import java.util.Arrays;

public class StartUl {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + "." + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new FindAllAction(), new ReplaceAction(),
                new DeleteAction(), new FindByIdAction(), new FindItemsByNameAction()

        };

        new StartUl().init(input, tracker, actions);

        /* System.out.println("----------------------------------------");
        Item item = new Item();
        Item item1 = tracker.add(new Item(1, "1 заявка"));
        Item item2 = tracker.add(new Item(2, "2 заявка"));
        Item item3 = tracker.add(new Item(3, "3 заявка"));
        Item[] items1 = {item1, item2, item3};
        for (Item all : items1) {
            System.out.println(all);
        }
        System.out.println();
        System.out.println(tracker.findById(1));
        System.out.println();
        Item bug = new Item();
        System.out.println(bug);
        System.out.println("-------------------------------------------");

        */
    }
}
