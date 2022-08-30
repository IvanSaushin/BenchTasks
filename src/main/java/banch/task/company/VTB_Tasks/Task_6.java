package banch.task.company.VTB_Tasks;

public class Task_6 {

    public void someMethod() {

        doSomeUsual1();

        RefCreator.printOperativeRef();

        doSomeUsual2();

    }

    public void someElseMethod() {

        doSomeUsual1();

        RefCreator.printHistoricalRef();

        doSomeUsual2();

    }

    private void doSomeUsual1() {

        System.out.println("do Some usual");

        System.out.println("do Some usual1");

    }

    private void doSomeUsual2() {

        System.out.println("do Some usual2");

        System.out.println("do Some usual3");

    }

    static class RefCreator {

        static void printOperativeRef() {

            System.out.println("operative ref");

        }

        static void printHistoricalRef() {

            System.out.println("historical ref");

        }

    }
    public static void main(String[] args){
        Task_6 refactorTest = new Task_6();
        refactorTest.someMethod();
        refactorTest.someElseMethod(); }

}
