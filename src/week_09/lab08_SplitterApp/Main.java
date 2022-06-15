package week_09.lab08_SplitterApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Budget Planner!");

        //Ask how many ppl in the budget planner?
        System.out.println("How many people will split the budget?");

        //Users DB
        ArrayList<User> userList = prepareUserLists(scanner);
        System.out.println("Added user count : " + userList.size());

        //Expenses DB
        ArrayList<Expense> expenseList = new ArrayList<>();

        String[] optionList = prepareOptionList();

        while (true) {

            System.out.println("What would you like to do?");

            for (int i = 1; i <= optionList.length; i++) {
                System.out.println(optionList[i-1] + ":" + (i));
            }

            int request = scanner.nextInt();
              /*
        Creating options
        1 : Make Expense                    // case 0
        2 : List Specific Person Expense    // case 1
        3 : List All Expenses               // case 2
        4 : Make Split                      // case 3
        5 : List All Users                  // case 4
        6 : Close the budget                // case 5
        */
            switch (request - 1) {
                case 0:

                    //ask expense: name, amount, user
                    Expense expense = new Expense();

//                    System.out.println("Expense name: ");
//                    expense.expenseName = scanner.next();
//
//                    System.out.println("Expense Amount: ");
//                    expense.amount = scanner.nextInt();
//
//                    System.out.println("Which user made this expense? Just type user id: ");
//                    //show all users: id:0 name: Ozzy
//                    for (User user : userList) {
//                        System.out.println("id: " + userList.indexOf(user) + "name:" + user.name);
//                    }
//
//                    int userId = scanner.nextInt();
//
//                    User user = userList.get(userId);
//
//                    expense.user = user.name;
//                    expenseList.add(expense);

                    Expense expense1 = new Expense();
                    expense1.expenseName = "food";
                    expense1.amount = 75;
                    expense1.user = userList.get(0).name; // "Ozzy";
                    Expense expense2 = new Expense();
                    expense2.expenseName = "transportation";
                    expense2.amount = 90;
                    expense2.user = userList.get(0).name; //"Ozzy";
                    Expense expense3 = new Expense();
                    expense3.expenseName = "hotel";
                    expense3.amount = 150;
                    expense3.user = userList.get(2).name; //"John";
                    expenseList.add(expense1);
                    expenseList.add(expense2);
                    expenseList.add(expense3);
                    break;

                case 1:

                    System.out.println("Please provide user name that you would like to search");
                    String userName = scanner.next();

                    User myUser = null;

                    for (User chosenUser : userList) {

                        if (chosenUser.name.equals(userName)) {
                            myUser = chosenUser;
                            break;
                        }
                    }

                    if (myUser == null) {
                        System.out.println("User not exists!");
                        break;
                    }

                    ///List Specific Person Expense
                    //0 - expense amount : 100, expense by :0zzy
                    //1 - expense amount : 100, expense by :0zzy
                    //ozzy spent $ 200

                    int userExpenseAmount = 0;
                    int expenseCount = 0;

                    for (Expense value : expenseList) {

                        if (value.user.equals(userName)) {

                            userExpenseAmount += value.amount;
                            expenseCount++;

                            System.out.println(expenseCount + " -expense amount:" + value.amount + ",expense by :" + value.user);
                        }

                    }

                    System.out.println(myUser.name + " spent $ " + userExpenseAmount);

                    break;


                case 2:

                    for (int i = 0; i < expenseList.size(); i++) {
                        System.out.println(i + " - expense amount:" + expenseList.get(i).amount + ", expense by:" + expenseList.get(i).user);
                    }

                    break;

                case 3:

                    double totalAmount = 0;
                    ArrayList<Split> splitList = calculateSplitByUser(expenseList);

                    for (Split split : splitList) {

                        totalAmount += split.amount;
                    }

                    makeSplit(totalAmount, splitList);
                    break;

                case 4:
                    break;
                case 5:
                    System.exit(0);

            }

        }


    }

    public static void makeSplit(double totalAmount, ArrayList<Split> splitList) {

        double average = totalAmount / splitList.size();

        //total 300
        //each person : 100

        for (Split split : splitList) {

            if (split.amount > average) {
                System.out.println(split.userName + " needs to take back " + (split.amount - average));
            } else {
                System.out.println(split.userName + " need to give " + (-1 * (split.amount - average)));
            }

        }


    }

    public static ArrayList<Split> calculateSplitByUser(ArrayList<Expense> expenseList) {

        ArrayList<Split> splitList = new ArrayList<>();

        for (Expense expense : expenseList) {

            Split split = existSplitList(expense.user, splitList);

            if (split != null) {
                split.amount += expense.amount;
            } else {
                Split willbeAdded = new Split();
                willbeAdded.userName = expense.user;
                willbeAdded.amount = expense.amount;
                splitList.add(willbeAdded);
            }
        }
        return splitList;
    }

    public static Split existSplitList(String userName, ArrayList<Split> splitList) {

        for (Split split : splitList) {
            if (split.userName.equals(userName)) {
                return split;
            }
        }
        return null;   //break till 3:30 (5 review)
    }


    public static ArrayList<User> prepareUserLists(Scanner scanner) {

        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.name = "Ozzy";
        user1.email = "ozzy@cydeo.com";
        User user2 = new User();
        user2.name = "Mike";
        user2.email = "mike@cydeo.com";
        User user3 = new User();
        user3.name = "John";
        user3.email = "john@cydeo.com";
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

//        int userCount = scanner.nextInt();
//
//        for (int i = 0; i < userCount; i++) {
//
//            User user = new User();
//
//            System.out.println("Name: ");
//            user.name = scanner.next();
//
//            System.out.println("Email: ");
//            user.email = scanner.next();
//
//            userList.add(user);
//
//        }

        return userList;

    }

    public static String[] prepareOptionList() {
                /*
        Creating options
        1 : Make Expense
        2 : List Specific Person Expense
        3 : List All Expenses
        4 : Make Split
        5 : List All Users
        6 : Close the budget
        */

        String[] optionList = {
                "Make Expense",
                "List Specific Person Expense",
                "List All Expenses",
                "Make Split",
                "List All Users",
                "Close the budget"};

        return optionList;

    }


}

